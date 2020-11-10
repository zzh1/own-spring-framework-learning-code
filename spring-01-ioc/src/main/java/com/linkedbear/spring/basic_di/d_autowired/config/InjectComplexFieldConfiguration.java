package com.linkedbear.spring.basic_di.d_autowired.config;

import com.linkedbear.spring.basic_di.d_autowired.bean.Cat;
import com.linkedbear.spring.basic_di.d_autowired.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.linkedbear.spring.basic_di.d_autowired.bean")
public class InjectComplexFieldConfiguration {

//    @Bean
//    @Autowired   //高版本不可标注
//    public Cat cat(Person person){
//        Cat cat = new Cat();
//        cat.setName("mimi");
//        cat.setPerson(person);
//        return cat;
//    }

    @Bean
//    解决方案二 ，在Bean后面加上Primary
//    @Primary
    public Person master111(){
        Person master = new Person();
        master.setName("master222");
        return master;
    }

}
