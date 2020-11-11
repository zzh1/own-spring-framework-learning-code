package com.linkedbear.spring.basic_di.h_aware.config;

import com.linkedbear.spring.basic_di.h_aware.bean.AwaredTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.linkedbear.spring.basic_di.h_aware.bean")
public class AwareConfiguration {

    @Bean
    public AwaredTestBean bbb(){
        return new AwaredTestBean();
    }

}
