package com.example.SharathCars.service;

import com.example.SharathCars.entity.Car;
import com.example.SharathCars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{
@Autowired
public CarRepository carRepository;

    @Override
    public Car addcar(Car cars) {
        return carRepository.save(cars);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getCarsByDate(String date) {
        return carRepository.findByDate(date);
    }


}
