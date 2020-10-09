package com.linkedbear.architecture.b_factory.factory;

import com.linkedbear.architecture.b_factory.dao.DemoDao;
import com.linkedbear.architecture.b_factory.dao.impl.DemoDaoImpl;
import com.linkedbear.architecture.b_factory.dao.impl.DemoOracleDao;

public class BeanFactory {
    public static DemoDao getDemoDao(){
        return new DemoDaoImpl();
//        return new DemoOracleDao();
    }
}
