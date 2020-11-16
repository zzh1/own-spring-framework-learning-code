package com.linkedbear.spring.bean.c_instantiate;

import com.linkedbear.spring.bean.c_instantiate.bean.Ball;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
        Ball ball = ctx.getBean(Ball.class);
        System.out.println(ball);

    }

}
