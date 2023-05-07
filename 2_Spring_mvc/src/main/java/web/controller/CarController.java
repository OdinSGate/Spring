package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Volkswagen", "white", 802));
        cars.add(new Car("BMW", "black", 146));
        cars.add(new Car("Audi", "blue", 404));
        cars.add(new Car("Kia", "grey", 823));
        cars.add(new Car("Lexus", "red", 289));
        cars = CarService.countCar(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
