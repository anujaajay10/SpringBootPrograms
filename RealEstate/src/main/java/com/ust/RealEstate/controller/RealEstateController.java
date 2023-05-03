package com.ust.RealEstate.controller;

import com.ust.RealEstate.entity.RealEstate;
import com.ust.RealEstate.service.RealEstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class RealEstateController {
    @Autowired
    private RealEstateService realEstateService;

    @GetMapping("/houses")
    public List<RealEstate> getallhouses() {
        return realEstateService.getallhouses();
    }

    @GetMapping("/zipcode/{zipcode}")
    public List<RealEstate> gethousesbyzipcode(@PathVariable double zipcode) {
        return realEstateService.gethousesbyzipcode(zipcode);
    }

    @GetMapping("/state/{state}")
    public List<RealEstate> gethousesbystate(@PathVariable String state) {
        return realEstateService.gethousesbystate(state);
    }
    @GetMapping("/city/{city}")
    public List<RealEstate>gethousesbycity(@PathVariable String city) {
        return realEstateService.gethousesbycity(city);
    }
    @GetMapping("/price/{price}")
    public List<RealEstate>gethousesbyprice(@PathVariable double price) {
        return realEstateService.gethousesbyprice(price);
    }


    }
