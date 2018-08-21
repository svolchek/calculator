package testng.trigonometry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.assertEquals;

public class SinTest extends BaseTest {
    @Test(dataProvider = "SinData", groups = "double", priority = 76)
    void sinTest(double a, double expected) {
        final double DIFF = 0.001;
        double radians = Math.toRadians(a);
        double result = calculator.sin(radians);
        assertEquals(result,expected,DIFF);

    }

    @DataProvider(name = "SinData")
    Object[] sinInitData() {
        return new Object[][]{
                {0.00, 0},
                {60.00, 0.8660},
                {45.00, 0.7071},
                {30.000, 0.5},
                {90.0,1.0},
                {225.00,-0.7071},
                {-270.000, 1.0000},
                {-45.000,-0.7071}
        };
    }

}
