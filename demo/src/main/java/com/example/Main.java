package com.example;

import com.example.Classes.Corporate;
import com.example.Classes.Hatchback;
import com.example.Classes.Individual;
import com.example.Classes.ManagerCarCustomer;
import com.example.Classes.SUV;
import com.example.Classes.Sedan;
import com.example.SuperClasses.Car;
import com.example.SuperClasses.Customer;

public class Main {
    public static void main(String[] args) {
            Car sedan = new Sedan("Toyota", "Camry", "D", 500.0, "Petrol", 800, 5);
            Car hatchback = new Hatchback("Ford", "Focus", "C", "Manual", 350.0, "Diesel", 600, 3);
            Car suv = new SUV("Jeep", "Cherokee", "E", "Automatic", 700.0, 1000, 2, 100);

            Customer individualCustomer = new Individual("Ahmet Yılmaz", "1234567890", 9800, "10000");
            Customer corporateCustomer = new Corporate("XYZ Corp.", "0987654321", 300000, "50000");

            ManagerCarCustomer manager = new ManagerCarCustomer();

            manager.rentCar(sedan, individualCustomer, "month");
            System.out.println("Remaining Budget: " + individualCustomer.getBudget());
            System.out.println("Sedan Count: " + sedan.getCount());

            manager.rentCar(hatchback, corporateCustomer, "day");
            System.out.println("Remaining Budget: " + corporateCustomer.getBudget());
            System.out.println("Hatchback Count: " + hatchback.getCount());

            manager.rentCar(suv, corporateCustomer, "day");
            System.out.println("Remaining Budget: " + corporateCustomer.getBudget());
            System.out.println("SUV Count: " + suv.getCount());
    }
}