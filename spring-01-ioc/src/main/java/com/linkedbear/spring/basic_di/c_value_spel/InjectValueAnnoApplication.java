package com.linkedbear.spring.basic_di.c_value_spel;

import com.linkedbear.spring.basic_di.c_value_spel.bean.Black;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.basic_di.c_value_spel.bean");
        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : "+black);

    }

}
