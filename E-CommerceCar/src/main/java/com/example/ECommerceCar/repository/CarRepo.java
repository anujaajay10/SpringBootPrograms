package com.example.ECommerceCar.repository;

import com.example.ECommerceCar.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer> {
    Car save(Car cars);
}
