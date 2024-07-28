package com.example.Classes;

import com.example.SuperClasses.Car;

public class Hatchback extends Car{
    private final double discount = 0.93;
    private final double hatchRent = 273.8;

    public Hatchback(String brand, String model, String segment, String gearType, double baggageCapacity, String fuelType, int count, 
        int age){
            super(brand, model, segment, gearType, baggageCapacity, fuelType, count, age);
            setDailyRent(hatchRent);

    }
    public double getDiscount(){
        return discount;
    }
    public double getRent(){
        return hatchRent;
    }
    @Override
    public double monthlyCharge(){
        return getRent() * discount * 30;
    }
}
