package testng.sub;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.*;

public class SubTest extends BaseTest {

    @Test(testName = "Sub long test", groups = "long")
    @Parameters ({"var1", "var2", "expected"})
    void lSubTest (long a, long b, long expected){
        long result = calculator.sub(a,b);
        assertEquals(result,expected);
    }
    @Test (testName = "Sub double test", groups = "double")
    @Parameters ({"var1", "var2", "expected"})
    void dSubTest (double a, double b, double expected){
        double result = calculator.sub(a,b);
        assertEquals(result,expected,DIFF);
    }
}
