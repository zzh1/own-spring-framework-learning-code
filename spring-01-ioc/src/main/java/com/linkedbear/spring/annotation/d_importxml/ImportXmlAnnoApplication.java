package com.linkedbear.spring.annotation.d_importxml;

import com.linkedbear.spring.annotation.d_importxml.config.ImportXmlAnnotationConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.Stream;

public class ImportXmlAnnoApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("annotation/import-anno.xml");
//        Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(ImportXmlAnnotationConfiguration.class);
        Stream.of(ctx2.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
