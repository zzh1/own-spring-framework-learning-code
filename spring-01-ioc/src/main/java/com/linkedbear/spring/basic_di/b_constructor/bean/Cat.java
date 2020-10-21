package com.linkedbear.spring.basic_di.b_constructor.bean;

public class Cat {
    private String name;
    private Person master;

    public Cat(String name, Person master) {
        this.name = name;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", master='" + master + '\'' +
                '}';
    }
}
