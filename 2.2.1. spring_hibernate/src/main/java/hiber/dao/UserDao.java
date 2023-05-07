package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void clean();

    List<User> listUsers();

    Object findUser(String model, int series);

}
