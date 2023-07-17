package org.example;

import org.example.model.Cab;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
        Cab c=(Cab) container.getBean("cab1");
        System.out.println(c);
        Cab c1=(Cab) container.getBean("cab2");
        System.out.println(c1);
    }
}
