package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarsController {

    private CarServiceImp carService;
    @Autowired
    public CarsController(CarServiceImp carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String print(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> list = carService.list(count);
        model.addAttribute("cars", list);
        return "cars";
    }
}
