package testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivZeroTest extends BaseTest {
    @Test (expectedExceptions = NumberFormatException.class, dataProvider = "DivZeroData", groups = "long", priority = 43)
    void divZeroTest(long a, long b){
        long result = calculator.div(a,b);
    }
    @DataProvider (name = "DivZeroData")
    Object[][] initData(){
        return new Object[][]{
                {2,-0},
                {0,0},
                {-500,0}
        };
    }
}
