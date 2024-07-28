package com.example.Classes;

import com.example.SuperClasses.Customer;

public class Individual extends Customer{
    private final String socialSecurityNumber;

    public Individual(String name, String phone, double budget, String socialSecurityNumber){
        super(name, phone, budget);
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
}
