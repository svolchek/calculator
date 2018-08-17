package testng;

import java.util.concurrent.TimeUnit;

public interface Sleep {
    default void sleep(){
        final short PERIOD=500;
        try {
            TimeUnit.MILLISECONDS.sleep(PERIOD);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
