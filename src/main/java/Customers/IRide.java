package Customers;

public interface IRide {
    String ride();
    boolean buyTicketForRide(Rides.IRide ride);
    boolean isOldEnoughForRide(double minAge);
    boolean isTallEnoughForRide(double minHeight);
}
