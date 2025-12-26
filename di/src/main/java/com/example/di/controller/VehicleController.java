package com.example.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.di.service.VehicleService;


@RestController
@RequestMapping("/api/vehicles")
// @Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    // HTTP METHOD WHICH WE MAINLY USE ARE : GET, POST, PUT, PATCH, DELETE.
    
    //  http://localhost:8080/api/vehicle/status
    @GetMapping("/status")
    public String getStatus(){
        return vehicleService.getServiceStatus();
    } 

    @GetMapping("/check/{id}")
    public String checkvehicleById(@PathVariable("id") int id){

        if (id<0) {
            throw new IllegalArgumentException("Invalid vehicle Id.");
        }

        return "Vehicle Id: " + id + " is available.";
    } 

}
