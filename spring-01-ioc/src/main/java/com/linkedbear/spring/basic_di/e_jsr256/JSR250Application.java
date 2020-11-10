package com.linkedbear.spring.basic_di.e_jsr256;

import com.linkedbear.spring.basic_di.e_jsr256.bean.Bird;
import com.linkedbear.spring.basic_di.e_jsr256.config.JSR250Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JSR250Application {

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(JSR250Configuration.class);
        Bird bird = ctx.getBean(Bird.class);
        System.out.println(bird);

    }

}
