package org.example;

import org.example.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
        Product p=(Product) container.getBean("p1");
        System.out.println(p);
        Product pp=(Product) container.getBean("p2");
        System.out.println(pp);
    }
}
