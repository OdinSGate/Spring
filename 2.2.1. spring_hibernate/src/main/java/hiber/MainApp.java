package hiber;

import hiber.config.AppConfig;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

//        userService.add(new User("Andrey", "Velichko", "andrey.velichko@yandex.ru", new Car("Volkswagen", 2013)));
//        userService.add(new User("Ivan", "Ivanov", "ivan.ivanov@yandex.ru", new Car("BMV", 2015)));
//        userService.add(new User("Alex", "Petrov", "alex.petrov@yandex.ru", new Car("Audi", 2002)));
//        userService.add(new User("Sergey", "Sidorov", "sergey.sidorov@yandex.ru", new Car("Lada", 2020)));

        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("Id = " + user.getId());
            System.out.println("First Name = " + user.getFirstName());
            System.out.println("Last Name = " + user.getLastName());
            System.out.println("Email = " + user.getEmail());
            System.out.println("Car model = " + user.getCar().getModel());
            System.out.println("Car series = " + user.getCar().getSeries());
            System.out.println();
        }

        System.out.println(userService.findUser("Volkswagen", 2013));
        context.close();
    }
}
