package com.example.ECommerceCar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private int carid;
    private String carname;
    private String year;
    @ElementCollection
    private List<String> colors;
    private String model;
    @ElementCollection
    private List<String> accessories;
    private String price;
    @ElementCollection
    private List<String> payment;
    @ElementCollection
    private List<String> cities;
}
