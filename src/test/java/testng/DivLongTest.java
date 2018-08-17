package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DivLongTest extends BaseTest {
    private long a;
    private long b;
    private long expected;

    @Factory(dataProvider = "DivData")
    public DivLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test (groups = "long", priority = 41)
    void lDivTest(){
        long result = calculator.div(a,b);
        assertEquals(result,expected);
    }

    @DataProvider(name = "DivData")
    static Object[][] initData(){
        return new Object[][]{
                {5,7,0},
                {60,-12,-5},
                {0,-30,0},
                {-40,7,-5}
        };
    }

}
