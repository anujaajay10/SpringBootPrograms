package com.ust.RealEstate.repository;

import com.ust.RealEstate.entity.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface RealEstateRepo extends JpaRepository<RealEstate,Integer> {
    List<RealEstate> findByZipcode(double zipcode);

    List<RealEstate> findByState(String state);

    List<RealEstate> findByCity(String city);

    List<RealEstate> findByPrice(double price);


}
