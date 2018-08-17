package delete;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;



public class AnotherSimpleClass extends SimpleClass {
    String name;



    public AnotherSimpleClass (String name){
        this.name = name;
    }

    @BeforeSuite
    void print3(){

        System.out.println("SUIT");
    }
    @AfterTest
    void print1(){
        System.out.println("AFTER:print1");
    }

//
//    @BeforeClass(enabled = true)
//    void setUp(){
//        System.out.println("ANOTHER: Setup configuration");
//    }


    @Parameters({"1.1"})
    @Test (dataProvider  = "DP")
    void doTest1(@Optional (value = "1.0") Double sum){
        System.out.println("Hello1 for "+name);
        Assert.assertEquals(Math.floor(sum),0.5+.5);

    }
   @Test (dependsOnMethods = "doTest1", timeOut = 100, invocationCount = 3)
   public  void doTest() throws InterruptedException {
        System.out.println("Hello");
        TimeUnit.MILLISECONDS.sleep(90);
        Assert.assertEquals(1d,0.5+.5);

    }
    @DataProvider(name = "DP")
    Object[] DataProvider(){
        return new Object[]{1.0, 1.1, 1.2, 1.3};
    }

    @AfterClass
    void closeSetUp(){
        System.out.println("ANOTHER: Close configuration");
    }
//    @BeforeTest
//    void print(){
//        System.out.println("BEFORE:print");
//    }
}

