package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carsList = new ArrayList<>();
    {
        carsList.add(new Car("Audi", "A3", 2009000));
        carsList.add(new Car("Audi", "A4", 2350000));
        carsList.add(new Car("Audi", "A5", 2715000));
        carsList.add(new Car("Audi", "A6", 3300000));
        carsList.add(new Car("Audi", "A7", 4100000));
    }
    @Autowired
    public CarServiceImpl() {
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carsList;
        }
        return carsList.subList(0, count);
    }
}


