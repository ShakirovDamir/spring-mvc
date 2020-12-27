package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    String name;
    String model;
    int price;

    public Car() {
    }

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Car> getAllCars() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Audi", "A3", 2009000));
        carsList.add(new Car("Audi", "A4", 2350000));
        carsList.add(new Car("Audi", "A5", 2715000));
        carsList.add(new Car("Audi", "A6", 3300000));
        carsList.add(new Car("Audi", "A7", 4100000));
    return carsList;
    }
}
