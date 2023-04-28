package com.example.ECommerceCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderedCar {
    private int carid;
    private String carname;
    private String year;
    private String  color;
    private String model;
    private String price;
}
