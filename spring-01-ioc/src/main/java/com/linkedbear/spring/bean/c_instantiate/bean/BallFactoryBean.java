package com.linkedbear.spring.bean.c_instantiate.bean;

import org.springframework.beans.factory.FactoryBean;

public class BallFactoryBean implements FactoryBean<Ball> {

    @Override
    public Ball getObject() throws Exception {
        return new Ball();
    }

    @Override
    public Class<?> getObjectType() {
        return Ball.class;
    }
}
