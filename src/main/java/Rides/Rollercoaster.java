package Rides;

public abstract class Rollercoaster {

    private double price;
    private double minHeight;
    private double minAge;

    public Rollercoaster(double price, double minHeight, double minAge) {
        this.price = price;
        this.minHeight = minHeight;
        this.minAge = minAge;
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






}
