package com.example.di.component;

import org.springframework.stereotype.Component;

import com.example.di.repository.VehicleRepository;

@Component("carBean")
public class Car implements VehicleRepository{

    @Override
    public String drive() {
        return "The car is driving with a speed of 100 kmph.";
    }
}
