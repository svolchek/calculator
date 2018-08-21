package testng.mult;
import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.BaseTest;

public class MultTest extends BaseTest {
    @Test(dataProvider = "lMultData", groups = "long", priority = 31)
    void lMultTest(long a, long b, long expected){
        long result = calculator.mult(a,b);
        assertEquals(result,expected);
    }
    @Test(dataProvider = "dMultData", groups = "double", priority = 32)
    void dMultTest(double a, double b, double expected){
        final double DIFF = 0.001;
        double result = calculator.mult(a,b);
        assertEquals(result,expected,DIFF);
    }
    @DataProvider(name = "lMultData")
    Object[][] lInitData (){
        return new Object[][]{
                {0,5,0},
                {7,8,56},
                {-1,1,-1},
                {-1,0,0},
                {-5,-7,35}
        };
    }
    @DataProvider(name = "dMultData")
    Object[][] dInitData (){
        return new Object[][]{
                {0.0,5.0,0.0},
                {7.54,8.67,65.3718},
                {-1.0000001,1,-1.00000001},
                {-1.00009,0,0},
                {-515,-7.14,-3677.1}
        };
    }
}
