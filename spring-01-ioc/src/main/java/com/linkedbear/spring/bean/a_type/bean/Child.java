package com.linkedbear.spring.bean.a_type.bean;

public class Child {

    //当前小孩子想玩的球
    private String wantToy = "ball";

    public String getWantToy(){
        return wantToy;
    }

    @Override
    public String toString() {
        return "Child{" +
                "wantToy='" + wantToy + '\'' +
                '}';
    }
}
