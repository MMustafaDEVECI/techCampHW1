package com.example.SuperClasses;

public abstract class Car {
    private final String brand;
    private final String model;
    private final String segment;
    private final String gearType;
    private final double baggageCapacity;
    private final String fuelType;
    private int count;
    private double dailyRent;
    private final int age;
    
    public Car(String brand, String model, String segment, String gearType, double baggageCapacity, String fuelType, int count, 
                int age){
                    this.brand = brand;
                    this.model = model;
                    this.segment = segment;
                    this.gearType = gearType;
                    this.baggageCapacity = baggageCapacity;
                    this.fuelType = fuelType;
                    this.count = count;
                    this.age = age;
    }

    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public String getSegment(){
        return this.segment;
    }
    public String getGearType(){
        return this.gearType;
    }
    public double getBaggageCapacity(){
        return this.baggageCapacity;
    }
    public String getFuelType(){
        return this.fuelType;
    }
    public int getCount(){
        return this.count;
    }
    public void rentCar(){
        if(count > 0){
            this.count--;
        }
        else{
            System.out.println("No car available");
        }
    }
    public int getAge(){
        return this.age;
    }
    public double getDailyRent(){
        return this.dailyRent;
    }
    public void setDailyRent(double rent){
        this.dailyRent = rent;
    }
    public abstract double monthlyCharge();
    
}
