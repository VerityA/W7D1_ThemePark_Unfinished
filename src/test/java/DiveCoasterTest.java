import Customers.Adult;
import Customers.Child;
import Customers.IRide;
import Rides.DiveCoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiveCoasterTest {

    DiveCoaster diveCoaster;

    @Before
    public void before() {
        diveCoaster = new DiveCoaster(7.50, 1.3, 16);
    }

    @Test
    public void canGetPrice() {
        assertEquals(7.50, diveCoaster.getPrice(), 0.01);
    }

    @Test
    public void  canGetMinHeight() {
        assertEquals(1.3, diveCoaster.getMinHeight(), 0.01);
    }

    @Test
    public void  canGetMinAge() {
        assertEquals(16, diveCoaster.getMinAge(), 0.01);
    }

    @Test
    public void canGetRiders() {
        assertEquals(0, diveCoaster.getRiders().size());
    }

    @Test
    public void canAddRidersOneOfAge() {
        IRide rider1 = new Adult(27, 1.5, 50.0);
        IRide rider2 = new Child(13, 1.4, 15.0);
        diveCoaster.addRider(rider1);
        diveCoaster.addRider(rider2);
        assertEquals(1, diveCoaster.getRiders().size());
    }

    @Test
    public void canAddRidersAllOfAge() {
        IRide rider1 = new Adult(27, 1.5, 50.0);
        IRide rider2 = new Child(18, 1.4, 15.0);
        diveCoaster.addRider(rider1);
        diveCoaster.addRider(rider2);
        assertEquals(2, diveCoaster.getRiders().size());
    }
}
