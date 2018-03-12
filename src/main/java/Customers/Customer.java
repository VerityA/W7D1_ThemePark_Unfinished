package Customers;

import Rides.AcceleratorCoaster;
import Rides.DiveCoaster;
import Rides.IRide;
import Rides.WingCoaster;

public abstract class Customer implements IPayForService, Customers.IRide {

    private double age;
    private double height;
    private double money;

    public Customer(double age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public boolean hasSufficientFunds(double price) {
        return price <= getMoney();
    }

    public void reduceMoneyByPrice(double price) {
        this.money = money - price;
    }

    public boolean isOldEnoughForRide(double minAge) {
        return this.age >= minAge;
    }

    public boolean isTallEnoughForRide(double minHeight) {
        return this.height >= minHeight;
    }



}
