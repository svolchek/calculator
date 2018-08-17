package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SubTest extends BaseTest {
    @Test(priority = 21, groups = "long")
    @Parameters ({"var1", "var2", "expected"})
    void lSubTest (long a, long b, long expected){
        long result = calculator.sub(a,b);
        assertEquals(result,expected);
    }
    @Test (priority = 22, groups = "double")
    @Parameters ({"var1", "var2", "expected"})
    void dSubTest (double a, double b, double expected){
        final double DIFF = 0.001;
        double result = calculator.sub(a,b);
        assertEquals(result,expected,DIFF);
    }
}
