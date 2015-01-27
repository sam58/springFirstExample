package com.sam58.fspr;

/**
 * Created by sam158 on 28.01.2015.
 * springBean
 */
public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("hello!"+name);

    }
}
