package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car>carList= new ArrayList<>();
    {
        carList.add(new Car("Audi","A3",2009000));
        carList.add(new Car("Audi","A4",2350000));
        carList.add(new Car("Audi","A5",2715000));
        carList.add(new Car("Audi","A6",3300000));
        carList.add(new Car("Audi","A7",4100000));
    }
    public List<Car> getAllCars(){
        return carList;
    }
    public List<Car> getSomeCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
