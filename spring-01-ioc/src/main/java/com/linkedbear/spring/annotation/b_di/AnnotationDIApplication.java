package com.linkedbear.spring.annotation.b_di;

import com.linkedbear.spring.annotation.b_di.bean.Cat;
import com.linkedbear.spring.annotation.b_di.bean.Person;
import com.linkedbear.spring.annotation.b_di.config.AnnotationDIConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDIApplication {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AnnotationDIConfiguration.class);
        Person person = ctx.getBean(Person.class);
        System.out.println(person);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

    }
}
