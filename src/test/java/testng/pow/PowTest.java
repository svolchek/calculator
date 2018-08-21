package testng.pow;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.*;

public class PowTest extends BaseTest {
    @Test(dataProvider = "PowData", groups = "double", priority = 51)
    void powTest(double a, double b, double expected) {
        final double DIFF = 0.001;
        double result = calculator.pow(a, b);
        assertEquals(result, expected, DIFF);
    }

    @DataProvider(name = "PowData")
    Object[][] dInitData() {
        return new Object[][]{
                {2.5, 2.5, 9.8821},
                {3.2, 0.5, 1.7888},
                {-2.0000001, 3, -8},
                {-0.0000, 5.60, 0.00},
                {1.4000, 5.0, 5.378},
                {5.7, -0.000000001, 1.0}

        };
    }
}
