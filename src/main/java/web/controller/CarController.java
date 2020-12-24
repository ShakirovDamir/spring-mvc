package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String showCar(ModelMap model){
        model.addAttribute("cars", CarService.getAllCars());
        return "/cars";

    }


}
