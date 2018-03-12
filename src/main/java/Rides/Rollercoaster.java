package Rides;

import Customers.IRide;

import java.util.ArrayList;

public abstract class Rollercoaster implements Rides.IRide {

    private double price;
    private double minHeight;
    private double minAge;
    private ArrayList<IRide> riders;

    public Rollercoaster(double price, double minHeight, double minAge) {
        this.price = price;
        this.minHeight = minHeight;
        this.minAge = minAge;
        this.riders = new ArrayList<>();

    }

    public double getPrice() {
        return price;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public double getMinAge() {
        return minAge;
    }

    public ArrayList<IRide> getRiders() {
        return riders;
    }

    public void addRider(IRide rider) {
        if (rider.buyTicketForRide(this))
        riders.add(rider);
    }
}
