package com.sam58.fspr;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sam158 on 28.01.2015.
 */
public class App {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorld obj=(HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
