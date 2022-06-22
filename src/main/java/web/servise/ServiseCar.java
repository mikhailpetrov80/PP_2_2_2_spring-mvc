package web.servise;

import web.model.Car;

import java.util.List;

public interface ServiseCar {
    List<Car> getCarsList(List<Car> cars, Integer cont);
}
