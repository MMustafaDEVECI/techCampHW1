package com.example.Classes;

import com.example.SuperClasses.Car;
import com.example.SuperClasses.Customer;

public class ManagerCarCustomer {
    
    public void rentCar(Car car, Customer customer, String period){
        if(car instanceof SUV && customer instanceof Individual){
            System.out.println("Individuals can't rent SUVs");
            return;
        }
        if(period.equals("month")){
            if(car instanceof SUV){
                System.out.println("SUVs can't be rent for a month");
                return;
            }
            car.rentCar();
            customer.rentCar(car.monthlyCharge());
        }
        else if(period.equals("day")){
            car.rentCar();
            customer.rentCar(car.getDailyRent());
        }
        else{
            System.out.println("You can only rent daily or monthly");
            return;
        }
    }
}
