package testng.sum;

import static org.testng.Assert.*;
import org.testng.annotations.*;
import testng.BaseTest;

public class SumDoubleTest extends BaseTest {

    private double a;
    private double b;
    private double expected;

    @Factory (dataProvider = "dataForSum")
    public SumDoubleTest(double var1, double var2, double expected) {
        a = var1;
        b = var2;
        this.expected = expected;
    }
    @Test(testName = "Sum double test",groups = "double")
    void dSumTest(){
        sleep();
        double result = calculator.sum(a,b);
        assertEquals(result,expected,DIFF);
    }




    @DataProvider(name = "dataForSum", parallel = true)
    static Object[][] dataForSum()
    {
        return new Object[][]{
                {1.5,2.98,4.48},
                {4.56,5,9.56},
                {4.13,-7.01,-2.88},
                {0,0.00000,0.00000}
        };
    }
}
