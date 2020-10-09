package com.linkedbear.architecture.d_properties.factory;

import com.linkedbear.architecture.d_properties.dao.DemoDao;

import java.io.IOException;
import java.util.Properties;

public class BeanFactory {

    private static Properties properties;

    static {
        properties=new Properties();

        try {
            //必须使用类加载器读取resource文件夹下的配置文件
            properties.load(BeanFactory.class.getClassLoader().getResourceAsStream("factory_d.properties"));
        } catch (IOException e) {
            throw new ExceptionInInitializerError("BeanFactory initialize error, cause: " + e.getMessage());
        }
    }

    public static DemoDao getBean(String beanName){

        try {
            Class<?> beanClazz = Class.forName(properties.getProperty(beanName));
            return (DemoDao) beanClazz.newInstance();
        }catch (ClassNotFoundException e) {
            throw new RuntimeException("BeanFactory have not [" +beanName+"] bean!",e);
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("["+beanName+"] instantiation error!",e);
        }


    }
}
