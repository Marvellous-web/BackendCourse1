package org.example.shoppingapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingMain {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
        CustomerModal c1=(CustomerModal) applicationContext.getBean("s1");
        CustomerModal c2=(CustomerModal) applicationContext.getBean("s2");

        System.out.println(c1);
        System.out.println(c2);
    }
}
