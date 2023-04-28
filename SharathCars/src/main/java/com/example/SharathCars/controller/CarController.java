package com.example.SharathCars.controller;

import com.example.SharathCars.entity.Car;
import com.example.SharathCars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;
    @PostMapping
    public Car addcar(@RequestBody Car cars){
        return carService.addcar(cars);
    }
    @GetMapping("/allcars")
    public List<Car> getAllCars(){
        return carService.getAllCars();
    }
    @GetMapping("/car/{date}")
    public List<Car> getCarsByDate(@PathVariable ("date") String date){
        return carService.getCarsByDate(date);

    }


}
