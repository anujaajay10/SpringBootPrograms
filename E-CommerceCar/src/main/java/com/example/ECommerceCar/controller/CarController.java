package com.example.ECommerceCar.controller;

import com.example.ECommerceCar.entity.Car;
import com.example.ECommerceCar.entity.OrderedCar;
import com.example.ECommerceCar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CarController {
    @Autowired
    private CarService carservice;
    @PostMapping("/cars")
    public Car addcars(@RequestBody Car cars){
        return carservice.addcars(cars);
    }
    @PostMapping("/cara")
    public OrderedCar addOrders(@RequestBody OrderedCar orderedCar)
    {
        return carservice.addorder(orderedCar);
    }


}
