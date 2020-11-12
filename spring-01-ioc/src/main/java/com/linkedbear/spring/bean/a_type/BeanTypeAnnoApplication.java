package com.linkedbear.spring.bean.a_type;

import com.linkedbear.spring.bean.a_type.bean.Toy;
import com.linkedbear.spring.bean.a_type.config.BeanTypeConfiguration;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class BeanTypeAnnoApplication {

    public static void main(String[] args) throws Exception{

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanTypeConfiguration.class);

//        Map<String,Toy> toys = ctx.getBeansOfType(Toy.class);
//        toys.forEach((name,toy)->{
//            System.out.println("toy name : " + name +","+toy.toString());
//        });

        Toy toy1 = ctx.getBean(Toy.class);
        Toy toy2 = ctx.getBean(Toy.class);
        System.out.println(toy1==toy2);

    }

}
