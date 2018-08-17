package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;


public class BaseTest implements Sleep{
    protected Calculator calculator;
    @BeforeClass (alwaysRun = true)
    void initCalculator(){
        calculator = new Calculator();
    }
}
