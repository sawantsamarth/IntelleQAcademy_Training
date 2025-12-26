package com.example.di.component;

import org.springframework.stereotype.Component;

import com.example.di.repository.VehicleRepository;

@Component("busBean")
public class Bus implements VehicleRepository{

    @Override
    public String drive() {
        return "The bus is driving with a speed of 50 kmph ";
    }

}
