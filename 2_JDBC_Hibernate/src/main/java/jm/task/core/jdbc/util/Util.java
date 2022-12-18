package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
//     реализуйте настройку соеденения с БД
    private static Connection connection;
    private static Util instance;

    private Util() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Util getInstance(){
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }

    public static Connection getConnection() {
        return connection;
    }
}