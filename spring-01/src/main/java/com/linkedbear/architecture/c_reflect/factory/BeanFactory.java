package com.linkedbear.architecture.c_reflect.factory;

import com.linkedbear.architecture.c_reflect.dao.DemoDao;

public class BeanFactory {
    public static DemoDao getDemoDao(){
//        return new DemoDaoImpl();
//        return new DemoOracleDao();

        try {
            return (DemoDao) Class.forName("com.linkedbear.architecture.c_reflect.dao.impl.DemoDaoImpl").newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("DemoDao instantiation error, cause: " + e.getMessage());
        }

    }
}
