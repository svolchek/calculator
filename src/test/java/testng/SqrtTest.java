package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SqrtTest extends BaseTest {
    @Test(dataProvider = "SqrtData", groups = "double", priority = 61)
    void sqrtTest(double a, double expected) {
        final double DIFF = 0.001;
        double result = calculator.sqrt(a);
        assertEquals(result, expected, DIFF);
    }
    @Test(groups = "double", priority = 62)
    void sqrtNegativeTest(){
        final double ONE_NEGATIVE = -13.13;
        double result = calculator.sqrt(ONE_NEGATIVE);
        assertTrue(Double.isNaN(result));
    }


    @DataProvider(name = "SqrtData")
    Object[][] dInitData() {
        return new Object[][]{
                {2.4, 1.5492},
                {16.000, 4},
                {0.0000001, 0},
                {12.35, 3.5142}
        };
    }
}
