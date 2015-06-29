package com.company;



/**
 * Created by maheshbr on 05/05/15.
 */
public class Employee {

    private String name;

    public String getName() {
        return name;
    }

    public Employee(String name){
        this.name = name;

    }

    public void printNotification(double stockPrice){

        System.out.println(String.format("Employee " + this.name + "New price of stock is %.2f", stockPrice));
    }
}
