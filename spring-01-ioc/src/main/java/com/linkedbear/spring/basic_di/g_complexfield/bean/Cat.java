package com.linkedbear.spring.basic_di.g_complexfield.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Cat {

    private String name = "cat";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
