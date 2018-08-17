package testng;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class IsNegativeTest extends BaseTest {

    @Test (groups = "long", priority = 84)
    void positiveTest(){
        final long ONE_NEGATIVE = -345;
        assertTrue(calculator.isNegative(ONE_NEGATIVE));
    }
    @Test (groups = "long", priority = 85)
    void negativeTest(){
        final long ONE_POSITIVE = 45;
        assertFalse(calculator.isNegative(ONE_POSITIVE));
    }
    @Test (groups = "long", priority = 86)
    void zeroTest(){
        final long ZERO = 0;
        assertFalse(calculator.isNegative(ZERO));
    }


}
