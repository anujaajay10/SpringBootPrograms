package com.example.SharathCars.service;

import com.example.SharathCars.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {

    Car addcar(Car cars);

    List<Car> getAllCars();


    List<Car> getCarsByDate(String date);
}
