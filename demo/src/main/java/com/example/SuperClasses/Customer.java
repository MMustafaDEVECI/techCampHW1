package com.example.SuperClasses;

public abstract class Customer {
    private final String name;
    private final String phone;
    private double budget;

    public Customer(String name, String phone, double budget){
        this.name = name;
        this.phone = phone;
        this.budget = budget;

    }
    
    public String getName(){
        return this.name;
    }
    public String getPhone(){
        return this.phone;
    }
    public double getBudget(){
        return this.budget;
    }
    public void rentCar(double cost){
        if(cost <= budget){
            budget -= cost;
        }
        else{
            System.out.println("Not enough budget");
        }
    }
}
