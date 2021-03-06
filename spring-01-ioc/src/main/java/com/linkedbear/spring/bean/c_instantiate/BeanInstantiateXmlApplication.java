package com.linkedbear.spring.bean.c_instantiate;

import com.linkedbear.spring.bean.c_instantiate.bean.Ball;
import com.linkedbear.spring.bean.c_instantiate.bean.Car;
import com.linkedbear.spring.bean.c_instantiate.bean.CarStaticFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiateXmlApplication {

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean-instantiate.xml");
//        Ball ball = ctx.getBean(Ball.class);
//        System.out.println(ball);

        ctx.getBeansOfType(Car.class).forEach((beanName,car)->{
            System.out.println(beanName+":"+car);
        });

        //尝试取一下静态工厂本身
//        System.out.println(ctx.getBean(CarStaticFactory.class));



    }

}
