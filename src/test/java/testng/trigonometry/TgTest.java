package testng.trigonometry;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TgTest extends BaseTest {
    @Test(dataProvider = "TgData", groups = "double", priority = 71)
    void tagTest(double a, double expected) {
        final double DIFF = 0.001;
        double radians = Math.toRadians(a);
        double result = calculator.tg(radians);
        assertEquals(result,expected,DIFF);

    }
    @Test(dataProvider = "TgNaNData", groups = "double", priority = 72)
    void tagNaNTest(double a){
        double radians = Math.toRadians(a);
        double result = calculator.tg(a);
        assertTrue(Double.isNaN(result));
    }


    @DataProvider(name = "TgData")
    Object[] tgInitData() {
        return new Object[][]{
                {0.00, 0},
                {30.00, 0.5774},
                {45.00, 1.000},
                {60.000, 1.7321},
                {-120.00,-1.17321},
                {180.000, -0.0000},
                {360.000,0.00000}
        };
    }
    @DataProvider(name = "TgNaNData")
    Object[] tgNaNInitData() {
        return new Object[][]{
                {90.00},
                {270.00},
        };
    }
}
