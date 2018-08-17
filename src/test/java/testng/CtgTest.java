package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CtgTest extends BaseTest {
    @Test(dataProvider = "CtgData", groups = "double", priority = 73)
    void ctgTest(double a, double expected) {
        final double DIFF = 0.001;
        double radians = Math.toRadians(a);
        double result = calculator.ctg(radians);
        assertEquals(result,expected,DIFF);

    }
    @Test(dataProvider = "CtgNaNData", groups = "double", priority = 74)
    void ctgNaNTest(double a){
        double radians = Math.toRadians(a);
        double result = calculator.ctg(a);
        assertTrue(Double.isNaN(result));
    }


    @DataProvider(name = "CtgData")
    Object[] ctgInitData() {
        return new Object[][]{
                {90.00, 0},
                {60.00, 0.5774},
                {45.00, 1.000},
                {30.000, 1.7321},
                {-150.00,-1.17321},
                {270.000, -0.0000},
                {-90.000,0.00000}
        };
    }
    @DataProvider(name = "CtgNaNData")
    Object[] tgNaNInitData() {
        return new Object[][]{
                {0.00},
                {180.00},
        };
    }
}
