package delete;

import org.testng.annotations.*;
import org.hamcrest.Matchers;
import org.hamcrest.MatcherAssert;

public class SimpleClass {


    @BeforeClass
    void setUp(){
        System.out.println("Setup configuration");
    }
    @BeforeTest
    void print(){
        System.out.println("print");
    }
    @AfterClass
    void closeSetUp(){
        System.out.println("Close configuration");
    }
    @Test(dataProvider = "DPSC" )
    private void printMe (String str)
    {
        System.out.println(str);
    }
    @DataProvider(name = "DPSC")
    Object[] provideStr(){
        return new Object[]{"Hello", "my", "name", "is", "Liosha"};
    }
}
