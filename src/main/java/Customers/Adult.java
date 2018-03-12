package Customers;


import Rides.IRide;

public class Adult extends Customer {
    public Adult(double age, double height, double money) {
        super(age, height, money);
    }

    public String ride() {
        return "Arrrrghhhhh!";
    }


    public boolean buyTicketForRide(IRide ride) {
        if (this.isOldEnoughForRide(ride.getMinAge())) {
            if (this.isTallEnoughForRide(ride.getMinHeight())) {
                if (this.hasSufficientFunds(ride.getPrice())) {
                    this.reduceMoneyByPrice(ride.getPrice());
                    return true;
                }

            }

    }
    return false;

    }


}
