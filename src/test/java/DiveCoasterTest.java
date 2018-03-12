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
}
