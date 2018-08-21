package testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseTest implements Sleep{
    protected Calculator calculator = new Calculator();
}
