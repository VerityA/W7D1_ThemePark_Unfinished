import Customers.Adult;
import Rides.AcceleratorCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdultTest {

    Adult adult;

    @Before
    public void before() {
        adult = new Adult(34, 1.65, 100);
    }

    @Test
    public void canGetAge() {
        assertEquals(34, adult.getAge(), 0.01);
    }

    @Test
    public void  canGetHeight() {
        assertEquals(1.65, adult.getHeight(), 0.01);
    }

    @Test
    public void canGetMoney() {
        assertEquals(100, adult.getMoney(), 0.01);
    }

    @Test
    public void hasSufficientFunds() {
        assertEquals(true, adult.hasSufficientFunds(10));
    }

    @Test
    public void canReduceMoneyByPrice() {
        adult.reduceMoneyByPrice(10);
        assertEquals(90, adult.getMoney(), 0.01 );
    }

    @Test
    public void canCheckIsOldEnoughForRide() {
        assertEquals(true, adult.isOldEnoughForRide(16));
    }

    @Test
    public void canCheckIsNotOldEnoughForRide() {
        assertEquals(false, adult.isOldEnoughForRide(35));
    }

    @Test
    public void canCheckIsTallEnoughForRide() {
        assertEquals(true, adult.isTallEnoughForRide(1.2));
    }

    @Test
    public void canCheckIsNotTallEnoughForRide() {
        assertEquals(false, adult.isTallEnoughForRide(2.1));
    }

    @Test
    public void canBuyTicketForRide() {
        AcceleratorCoaster acceleratorCoaster = new AcceleratorCoaster(6.5, 1.2, 15);
        adult.buyTicketForRide(acceleratorCoaster);
        assertEquals(93.5, adult.getMoney(), 0.01);
    }

}
