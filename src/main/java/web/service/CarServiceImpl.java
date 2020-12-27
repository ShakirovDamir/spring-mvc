package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> getCars(Integer count) {
        List<Car>carsList = new Car().getAllCars();
        if (count == null || count > 5) {
            return carsList;
    }
     return carsList.stream().limit(count).collect(Collectors.toList());
    }
}
