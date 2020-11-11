package com.linkedbear.spring.basic_di.i_lazyinject.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    //属性字段的延迟注入
    @Autowired
    private ObjectProvider<Person> person;

    //构造器的延迟注入
//    @Autowired
//    public Dog(ObjectProvider<Person> person) {
//        //如果没有bean，则采用缺省策略创建
//        this.person = person.getIfAvailable(Person::new);
//    }

    //setter的延迟注入
//    @Autowired
//    public void setPerson(ObjectProvider<Person> person){
//        //有bean才取出，注入
//        this.person = person.getIfAvailable();
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "person=" + person.getIfAvailable(Person::new) +
                '}';
    }
}
