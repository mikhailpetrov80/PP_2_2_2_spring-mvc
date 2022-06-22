package web.servise;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ServiseCarImpl implements ServiseCar{
    @Override
    public List<Car> getCarsList(List<Car> cars, Integer cont) {
        if (cont == null) {
            return cars;
        } else if (cont > 0 & cont < 5) {
            return cars.stream().limit(cont).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
