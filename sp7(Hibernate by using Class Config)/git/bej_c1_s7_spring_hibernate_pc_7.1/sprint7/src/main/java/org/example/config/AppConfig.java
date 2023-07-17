package org.example.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.Properties;

@Configuration @EnableTransactionManagement
public class AppConfig {
    @Bean
    public ViewResolver getViewResolver()
    {
        return new InternalResourceViewResolver("/Web-INF/display",".jsp");
    }

    @Bean
    public DataSource getDataSource()

    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/wave31dbmovie");
        ds.setUsername("root");
        ds.setPassword("Admin@123");
        return ds;
    }

    @Bean
    public LocalSessionFactoryBean getSessionFactory(DataSource dataSource)
    {
        LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setPackagesToScan("org.example.domain");
        Properties properties=new Properties();
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        properties.put("hibernate.hbm2ddl.auto","update");
        sessionFactoryBean.setHibernateProperties(properties);
        return sessionFactoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
    {

        HibernateTransactionManager transactionManager=new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;

    }
}
