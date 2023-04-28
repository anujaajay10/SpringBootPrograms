package com.example.ECommerceCar.service;

import com.example.ECommerceCar.entity.Car;
import com.example.ECommerceCar.entity.OrderedCar;
import com.example.ECommerceCar.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepo repo;
    public Car addcars(Car cars) {
        return repo.save(cars);
    }

    public OrderedCar addorder(OrderedCar orderedCar) {
        OrderedCar old=null;
        Optional<Car> op=repo.findById(orderedCar.getCarid());
        if(op.isPresent()){
            old=op.get();
            old.setCarname(orderedCar.getCarname());

        }
        return null;
    }
}
