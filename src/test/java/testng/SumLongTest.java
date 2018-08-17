package testng;

import static org.testng.Assert.*;
import org.testng.annotations.*;

public class SumLongTest extends BaseTest {
    private long a;
    private long b;
    private long expected;

    @Factory (dataProvider = "dataForSum")
    public SumLongTest(long var1, long var2, long expected) {
        a = var1;
        b = var2;
        this.expected = expected;
    }
    @Test(groups = "long", priority = 11)
    void lSumTest(){
        sleep();
        long result = calculator.sum(a,b);
        assertEquals(result,expected);
    }




    @DataProvider(name = "dataForSum")
    static Object[][] dataForSum()
    {
        return new Object[][]{
                {1,2,3},
                {4,5,9},
                {4,-7,-3},
                {0,0,0}
        };
    }
}
