package org.example.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
    public static SessionFactory getSessionFactory() {
        SessionFactory sf=null;
        try {
            Configuration cfg=new Configuration();
            cfg.configure("hibernate.cfg.xml");
            cfg.addResource("hbm.xml");
            StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
            ssrb.applySettings(cfg.getProperties());
            ServiceRegistry registry=ssrb.build();
            sf=cfg.buildSessionFactory(registry);



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    return sf;
    }
}

