package com.linkedbear.spring.bean.a_type.bean;

public abstract class Toy {

    private String name;

    public Toy(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                '}';
    }
}
