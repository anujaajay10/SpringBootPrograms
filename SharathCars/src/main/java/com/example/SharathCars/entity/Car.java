package com.example.SharathCars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
    @Id
    private int carid;
    private String date;
    private String carname;
    private String price;
    private String brand;
    private String color;
    private int noofseats;


}
