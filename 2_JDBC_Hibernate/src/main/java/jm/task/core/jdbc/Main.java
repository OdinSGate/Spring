package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();
        userService.saveUser("Andrey", "Velichko", (byte) 26);
        userService.saveUser("Evgen", "Ivanov", (byte) 20);
        userService.saveUser("Nikolay", "Sidorov", (byte) 24);
        userService.saveUser("Vasya", "Petrov", (byte) 34);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}