package com.linkedbear.spring.bean.c_instantiate.config;

import com.linkedbear.spring.bean.c_instantiate.bean.BallFactoryBean;
import com.linkedbear.spring.bean.c_instantiate.bean.Car;
import com.linkedbear.spring.bean.c_instantiate.bean.CarStaticFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInstantiateConfiguration {

    @Bean
    public BallFactoryBean ballFactoryBean(){
        return new BallFactoryBean();
    }

    //编程式使用静态工厂
    @Bean
    public Car car2(){
        return CarStaticFactory.getCar();
    }

}
