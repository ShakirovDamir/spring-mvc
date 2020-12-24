package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> getAllCars(){
        List<Car>carList = new ArrayList<>();
        carList.add(new Car("Audi","A3",2009000));
        carList.add(new Car("Audi","A4",2350000));
        carList.add(new Car("Audi","A5",2715000));
        carList.add(new Car("Audi","A6",3300000));
        carList.add(new Car("Audi","A7",4100000));
        return carList;
    }
}
