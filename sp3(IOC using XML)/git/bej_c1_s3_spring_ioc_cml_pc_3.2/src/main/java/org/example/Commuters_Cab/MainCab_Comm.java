package org.example.Commuters_Cab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCab_Comm {

    public static void main(String[] args) {

        ApplicationContext app=new ClassPathXmlApplicationContext("beans1.xml");
        ModalCommuters modalCommuters= (ModalCommuters) app.getBean("a1");
        System.out.println(modalCommuters);
    }
}
