package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maheshbr on 05/05/15.
 */
public class Stock {

    private double stockPrice;
    private String stockName;
    List<Employee> employees;

    public Stock(double stockPrice, String stockName) {
        this.stockPrice = stockPrice;
        this.stockName = stockName;
        this.employees = new ArrayList<Employee>();
    }

    protected void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " subscribed for updates about " + this.stockName);
    }

    protected void removeEmployee(Employee employee) {
        employees.remove(employee);
        System.out.println(employee.getName() + " unsubscribed for updates about "+ this.stockName);
    }

    public void setPrice(double newPrice) {
        stockPrice = newPrice;
        for (Employee e : employees) {
            e.printNotification(stockPrice);
        }
    }
}
