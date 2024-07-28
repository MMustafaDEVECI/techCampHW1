package com.example.Classes;

import com.example.SuperClasses.Car;

public class SUV extends Car {
    private final double suvRent = 325.5;
    private final double fuelCapacity;

    public SUV(String brand, String model, String segment, String gearType, double baggageCapacity, int count, 
        int age, double fuelCapacity){
        super(brand, model, segment, gearType, baggageCapacity, "petrolium", count, age);
        setDailyRent(suvRent);
        this.fuelCapacity = fuelCapacity;
        
    }
    
    public double getFuelCapacity(){
        return fuelCapacity;
    }

    @Override
    public double monthlyCharge() {
        throw new UnsupportedOperationException("Unimplemented method 'monthlyCharge'");
    }

   
}
