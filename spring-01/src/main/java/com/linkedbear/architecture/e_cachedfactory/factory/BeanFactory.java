package com.linkedbear.architecture.e_cachedfactory.factory;

import com.linkedbear.architecture.e_cachedfactory.dao.DemoDao;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

    private static Properties properties;

    //缓存区,保存已经创建好的对象
    private static Map<String,Object> beanMap=new HashMap<>();

    static {
        properties=new Properties();

        try {
            //必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory_e.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static DemoDao getBean(String beanName){
        //双检锁保证beanMap中确实没有beanName对应的对象
        if(!beanMap.containsKey(beanName)){
            synchronized (BeanFactory.class){
                if(!beanMap.containsKey(beanName)){
                    try {
                        Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
                        Object bean =  beanClazz.newInstance();
                        //反射创建后放入缓存再放回
                        beanMap.put(beanName,bean);
                    }catch (ClassNotFoundException e) {
                        throw new RuntimeException("BeanFactory have not [" +beanName+"] bean!",e);
                    } catch (InstantiationException | IllegalAccessException e) {
                        throw new RuntimeException("["+beanName+"] instantiation error!",e);
                    }
                }
            }
        }
        return (DemoDao) beanMap.get(beanName);
    }
}
