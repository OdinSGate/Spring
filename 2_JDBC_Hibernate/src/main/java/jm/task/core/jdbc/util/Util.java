package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.internal.SessionFactoryImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
    //     реализуйте настройку соеденения с БД
    /*JDBC*/
    private static Connection connection;
    private static Util instance;

    private Util() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public static Connection getConnection() {
        return connection;
    }

    /*Hibernate*/
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration(); // - по умолчанию вызывает hibernate.properties
//                configuration.configure(); - по умолчанию вызывает xml
                configuration.addAnnotatedClass(User.class);
                sessionFactory = configuration.buildSessionFactory();
                System.out.println("Session OK!");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return sessionFactory;
    }

}