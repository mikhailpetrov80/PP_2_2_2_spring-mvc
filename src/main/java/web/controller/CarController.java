package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.servise.ServiceCar;
import web.servise.ServiceCarImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private final ServiceCar serviceCar = new ServiceCarImpl();

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, ModelMap carModel) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "5", 535));
        cars.add(new Car("Mercedes", "GL", 500));
        cars.add(new Car("Mazda", "CX", 9));
        cars.add(new Car("Ford", "Explorer", 4));
        cars.add(new Car("Hummer", "H3", 3));
        carModel.addAttribute("cars", serviceCar.getCarsList(cars, count));
        return "indexCar";
    }
}
