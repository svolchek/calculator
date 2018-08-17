package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Before;
import testng.Sleep;

public class BaseTest implements Sleep {
    protected Calculator calculator;
    @Before
    void initCalculator(){
        calculator = new Calculator();
    }
}
