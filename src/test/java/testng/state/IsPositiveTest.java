package testng.state;

import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.*;

public class IsPositiveTest extends BaseTest {
    @Test (groups = "long", priority = 81)
    void positiveTest(){
        final long ONE_POSITIVE = 345;
        assertTrue(calculator.isPositive(ONE_POSITIVE));
    }
    @Test (groups = "long", priority = 82)
    void negativeTest(){
        final long ONE_NEGATIVE = -45;
        assertFalse(calculator.isPositive(ONE_NEGATIVE));
    }
    @Test (groups = "long", priority = 83)
    void zeroTest(){
        final long ZERO = 0;
        assertFalse(calculator.isPositive(ZERO));
    }


}
