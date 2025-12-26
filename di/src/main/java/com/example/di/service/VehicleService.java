package com.example.di.service;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.di.repository.VehicleRepository;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository;
     
    // @Autowired
    public VehicleService (@Qualifier("busBean") VehicleRepository vehicleRepository ){
        this.vehicleRepository = vehicleRepository;
    }

    public String getServiceStatus(){
        return vehicleRepository.drive();
    }



}
