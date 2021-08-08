package com.carWasher.web;

import com.carWasher.model.Car;
import com.carWasher.model.Driver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/carWasherController")
@EnableAutoConfiguration
public class CarWasherController {

    public static void main(String[] args) {
        SpringApplication.run(CarWasherController.class);
    }

    @RequestMapping(value = "cars")
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        Driver driver1 = new Driver(1, "Name1", "Surname1", "Phone1", "Address1");
        Driver driver2 = new Driver(2, "Name2", "Surname2", "Phone2", "Address2");
        Driver driver3 = new Driver(3, "Name3", "Surname3", "Phone3", "Address3");

        Car car1 = new Car(1, "2021", "Color1", 1, driver1);
        Car car2 = new Car(2, "2021", "Color2", 2, driver2);
        Car car3 = new Car(3, "2021", "Color3", 3, driver3);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        return cars;
    }

    @RequestMapping(value = "carNameFord")
    public ModelAndView fordJsp() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "ford");
        modelAndView.setViewName("ford");

        return modelAndView;
    }
}
