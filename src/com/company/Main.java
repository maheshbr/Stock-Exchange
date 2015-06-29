package com.company;

public class Main {

    public static void main(String[] args) {

        Stock infyStock = new Stock(100.00, "Infibeam");
        Stock testStock = new Stock(200.00, "Test");

        Employee mahesh = new Employee("Mahesh");
        Employee arshika = new Employee("Arshika");

        infyStock.addEmployee(mahesh);
        infyStock.addEmployee(arshika);
        testStock.addEmployee(arshika);

        infyStock.setPrice(101.99);
        testStock.setPrice(300.89);

        infyStock.removeEmployee(arshika);

    }
}
