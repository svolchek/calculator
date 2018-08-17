package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CosTest extends BaseTest{
    @Test(dataProvider = "CosData", groups = "double", priority = 75)
    void cosTest(double a, double expected) {
        final double DIFF = 0.001;
        double radians = Math.toRadians(a);
        double result = calculator.cos(radians);
        assertEquals(result,expected,DIFF);


    }

    @DataProvider(name = "CosData")
    Object[] cosInitData() {
        return new Object[][]{
                {0.00, 1},
                {30.00, 0.8660},
                {45.00, 0.7071},
                {60.000, 0.5},
                {90.0,0.0},
                {225.00,-0.7071},
                {-270.000, 0.0000},
                {-45.000,-0.7071}
        };
    }

}
