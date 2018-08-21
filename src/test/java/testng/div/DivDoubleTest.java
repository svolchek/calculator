package testng.div;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import testng.BaseTest;

import static org.testng.Assert.*;

public class DivDoubleTest extends BaseTest {
    private double a;
    private double b;
    private double expected;

    @Factory(dataProvider = "DivData")
    public DivDoubleTest(double a, double b, double expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test(groups = "double", priority = 42)
    void dDivTest(){
        final double DIFF = 0.001;
        double result = calculator.div(a,b);
        assertEquals(result,expected,DIFF);
    }

    @DataProvider(name = "DivData")
    static Object[][] initData(){
        return new Object[][]{
                {0,7.88,0.000},
                {-0.5,-2.0,0.25},
                {-13.4,2.0,-6.7},
                {100,100,1.0},
                {3.4,0,Double.POSITIVE_INFINITY},
                {-13.4,0,Double.NEGATIVE_INFINITY}
        };
    }


}
