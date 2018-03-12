package Customers;

import Rides.AcceleratorCoaster;
import Rides.DiveCoaster;
import Rides.WingCoaster;

public abstract class Customer {

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

    public void buyTicketForRide(AcceleratorCoaster acceleratorCoaster) {
        if (this.isOldEnoughForRide(acceleratorCoaster.getMinAge())) {
            if (this.isTallEnoughForRide(acceleratorCoaster.getMinHeight())) {
                if (this.hasSufficientFunds(acceleratorCoaster.getPrice())) {
                    this.reduceMoneyByPrice(acceleratorCoaster.getPrice());
                }
            }
        }
    }

    public void buyTicketForRide(DiveCoaster diveCoaster) {
        if (this.isOldEnoughForRide(diveCoaster.getMinAge())) {
            if (this.isTallEnoughForRide(diveCoaster.getMinHeight())) {
                if (this.hasSufficientFunds(diveCoaster.getPrice())) {
                    this.reduceMoneyByPrice(diveCoaster.getPrice());
                }
            }
        }
    }

    public void buyTicketForRide(WingCoaster wingCoaster) {
        if (this.isOldEnoughForRide(wingCoaster.getMinAge())) {
            if (this.isTallEnoughForRide(wingCoaster.getMinHeight())) {
                if (this.hasSufficientFunds(wingCoaster.getPrice())) {
                    this.reduceMoneyByPrice(wingCoaster.getPrice());
                }
            }
        }
    }
}
