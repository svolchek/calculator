package delete;

import org.testng.annotations.Factory;

public class AnotherSimpleClassFactory {
    final static int COUNT = 5;

    @Factory
    public Object[] creator (){
        Object[] tests = new Object[COUNT];
        for (int i = 0; i < COUNT; i++) {
            tests[i] = new AnotherSimpleClass("instance #"+i);
        }
        return tests;
    }
}
