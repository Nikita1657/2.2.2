package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = Arrays.asList(
                new Car("Toyota", "Corolla", 2022 ),
                new Car("Honda", "CR-V", 2008 ),
                new Car("Chevrolet ", "Silverado", 2007),
                new Car("Ford ", "F-Series", 2023),
                new Car("Tesla", "Model 3", 2024)
        );
    }

    @Override
    public List<Car> getCars(int count) {
        return count >= 5 ? cars : cars.subList(0, count);
    }
}