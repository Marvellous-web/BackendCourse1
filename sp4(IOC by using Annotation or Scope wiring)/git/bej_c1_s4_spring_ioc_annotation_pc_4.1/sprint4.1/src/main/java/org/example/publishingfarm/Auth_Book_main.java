package org.example.publishingfarm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Auth_Book_main {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
//        Author author=container.getBean("auth1", Author.class);
        Author author1=(Author)container.getBean("auth1", Author.class);
        System.out.println(author1);


    }
}
