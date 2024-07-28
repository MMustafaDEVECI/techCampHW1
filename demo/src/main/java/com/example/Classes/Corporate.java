package com.example.Classes;

import com.example.SuperClasses.Customer;

public class Corporate extends Customer{
    private final String taxNo;

    public Corporate(String name, String phone, double budget, String taxNo){
        super(name, phone, budget);
        this.taxNo = taxNo;
    }
    public String getTaxNo(){
        return this.taxNo;
    }
}
