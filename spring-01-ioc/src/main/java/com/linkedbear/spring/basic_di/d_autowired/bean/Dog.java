package com.linkedbear.spring.basic_di.d_autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Dog {

    @Value("dogdog")
    private String name;

    //将person注入dog-属性注入
//    @Autowired(required = false)
    //解决方案一：在Autowired下面加上Qualifier
//    @Qualifier("administrator")
//    private Person person;
//    private Person master;

    //一组bean的全部注入
    @Autowired
    private List<Person> persons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }

    //构造器注入
//    @Autowired
//    public Dog(Person person) {
//        this.person = person;
//    }

//    //setter注入
////    @Autowired
//    public void setPerson(Person person) {
//        this.master = person;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", person=" + master +
//                '}';
//    }
}
