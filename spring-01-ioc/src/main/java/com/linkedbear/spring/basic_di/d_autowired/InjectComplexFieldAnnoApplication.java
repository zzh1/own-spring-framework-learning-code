package com.linkedbear.spring.basic_di.d_autowired;

import com.linkedbear.spring.basic_di.d_autowired.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class InjectComplexFieldAnnoApplication {

    public static void main(String[] args)  throws  Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.basic_di.d_autowired.bean");
        Dog dog = ctx.getBean(Dog.class);
        System.out.println(dog);

    }

}
