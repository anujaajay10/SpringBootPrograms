package com.ust.RealEstate.service;

import com.ust.RealEstate.entity.RealEstate;
import com.ust.RealEstate.repository.RealEstateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RealEstateService {
    @Autowired
    public  RealEstateRepo realEstateRepo;

    public List<RealEstate> getallhouses() {
        return realEstateRepo.findAll();
    }

    public List<RealEstate> gethousesbyzipcode(double zipcode) {
        return realEstateRepo.findByZipcode(zipcode);
    }

    public List<RealEstate> gethousesbystate(String state) {
        return realEstateRepo.findByState(state);
    }

    public List<RealEstate> gethousesbycity(String city) {
        return realEstateRepo.findByCity(city);
    }

    public List<RealEstate> gethousesbyprice(double price) {
        return realEstateRepo.findByPrice(price);
    }
}
