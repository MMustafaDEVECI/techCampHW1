package com.example.Classes;

import com.example.SuperClasses.Car;

public class Sedan extends Car{
    private double discount = 0.85;
    private final double sedanRent = 220.2;

    public Sedan(String brand, String model, String segment, double baggageCapacity, String fuelType, int count, 
        int age){
            super(brand, model, segment, "automatic", baggageCapacity, fuelType, count, age);
            setDailyRent(sedanRent);
            setDiscount(segment);

    }
    public double getDiscount(){
        return discount;
    }
    public double getRent(){
        return sedanRent;
    }
    private void setDiscount(String segment){
        if(segment.equals("A") || segment.equals("B")){
            this.discount = discount * 0.65;
        }
    }
    @Override
    public double monthlyCharge(){
        return getRent() * discount * 30;
    }
}
