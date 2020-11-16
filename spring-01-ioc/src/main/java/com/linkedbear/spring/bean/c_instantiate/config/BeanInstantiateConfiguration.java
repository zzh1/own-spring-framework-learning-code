package com.linkedbear.spring.bean.c_instantiate.config;

import com.linkedbear.spring.bean.c_instantiate.bean.BallFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInstantiateConfiguration {

    @Bean
    public BallFactoryBean ballFactoryBean(){
        return new BallFactoryBean();
    }

}
