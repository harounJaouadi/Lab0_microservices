package com.directi.training.srp.exercice_refactored;

import java.util.Arrays;
import java.util.List;

public class CarRepository
{
    private List<Car> _carsDb;

    public CarRepository()
    {
        _carsDb = Arrays.asList(new Car("1", "Golf III", "Volkswagen"),
                new Car("2", "Multipla", "Fiat"),
                new Car("3", "Megane", "Renault"));
    }

    public Car getCarById(String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars()
    {
        return _carsDb;
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
