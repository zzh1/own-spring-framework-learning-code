package com.linkedbear.spring.annotation.c_scan;

import com.linkedbear.spring.annotation.c_scan.bean.Person;
import com.linkedbear.spring.annotation.c_scan.config.ComponentScanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanApplication {
    public static void main(String[] args) throws Exception{
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.annotation.c_scan.bean");
        Person person = ctx.getBean(Person.class);
        System.out.println(person);

    }
}
