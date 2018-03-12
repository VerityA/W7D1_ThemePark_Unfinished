package Customers;

public interface IPayForService {

    boolean hasSufficientFunds(double price);

    void reduceMoneyByPrice(double price);

}
