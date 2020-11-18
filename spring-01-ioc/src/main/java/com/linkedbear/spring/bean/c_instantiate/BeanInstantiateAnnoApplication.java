package com.linkedbear.spring.bean.c_instantiate;

import com.linkedbear.spring.bean.c_instantiate.bean.Ball;
import com.linkedbear.spring.bean.c_instantiate.bean.Car;
import com.linkedbear.spring.bean.c_instantiate.config.BeanInstantiateConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanInstantiateAnnoApplication {

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanInstantiateConfiguration.class);
//        Ball ball = ctx.getBean(Ball.class);
//        System.out.println(ball);

        ctx.getBeansOfType(Car.class).forEach((beanName, car)->{
            System.out.println(beanName+":"+car);
        });

    }


}
