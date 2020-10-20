package com.linkedbear.spring.annotation.d_importxml.config;

import com.linkedbear.spring.annotation.d_importxml.bean.Person;
import org.springframework.context.annotation.Bean;

public class AnnotationConfigConfiguration {

    @Bean
    public Person person(){
        return new Person();
    }

}
