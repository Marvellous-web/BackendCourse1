package org.example.modal;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtilNew
{
    public static SessionFactory getSessionFactory()
    {
        SessionFactory sessionFactory=null;
        try
        {
            Properties properties=new Properties();
            properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL,"jdbc:mysql://localhost:3306/songhib_db");
            properties.put(Environment.USER,"root");
            properties.put(Environment.PASS,"Admin@123");
            properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.SHOW_SQL,"true");
            properties.put(Environment.HBM2DDL_AUTO,"update");

            Configuration configuration=new Configuration();
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Song.class);

            StandardServiceRegistryBuilder standardServiceRegistryBuilder=new StandardServiceRegistryBuilder();
            standardServiceRegistryBuilder.applySettings(configuration.getProperties());
            ServiceRegistry serviceRegistry =standardServiceRegistryBuilder.build();
            sessionFactory=configuration.buildSessionFactory(serviceRegistry);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return sessionFactory;
    }

}
