package com.linkedbear.spring.basic_di.d_autowired;

import com.linkedbear.spring.basic_di.d_autowired.bean.Cat;
import com.linkedbear.spring.basic_di.d_autowired.bean.Dog;
import com.linkedbear.spring.basic_di.d_autowired.config.InjectComplexFieldConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class InjectComplexFieldAnnoApplication {

    public static void main(String[] args)  throws  Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.basic_di.d_autowired.bean");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);

        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(InjectComplexFieldConfiguration.class);
        Cat cat = ctx2.getBean(Cat.class);
        System.out.println(cat);


    }

}
