package com.linkedbear.spring.basic_di.c_value_spel;

import com.linkedbear.spring.basic_di.c_value_spel.bean.*;
import com.linkedbear.spring.basic_di.c_value_spel.config.InjectValueConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectValueAnnoApplication {

    public static void main(String[] args) throws Exception {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.basic_di.c_value_spel.bean");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(InjectValueConfiguration.class);

        Black black = ctx.getBean(Black.class);
        System.out.println("simple value : "+black);

        Red red = ctx.getBean(Red.class);
        System.out.println("properties value : "+red);

        Blue blue = ctx.getBean(Blue.class);
        System.out.println("use spel : " + blue);

        Green green = ctx.getBean(Green.class);
        System.out.println("use spel bean property : "+ green);

        White white = ctx.getBean(White.class);
        System.out.println("use spel methods : " + white);
    }

}
