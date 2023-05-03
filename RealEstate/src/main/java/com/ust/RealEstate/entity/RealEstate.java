package com.ust.RealEstate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="realestate")

public class RealEstate {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="status")
    private String status;
    @Column(name="bed")
    private double bed;
    @Column(name="bath")
    private double bath;
    @Column(name="acre_lot")
    private double acre_lot;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zip_code")
    private double zipcode;
    @Column(name="house_size")
    private String house_size ;
    @Column(name="prev_sold_date")
    private String prev_sold_date;
    @Column(name="price")
    private double price;

}
