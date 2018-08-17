package testng.Listeners;

import org.testng.*;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Listener implements IInvokedMethodListener, ISuiteListener, ITestListener {
    static short succededTest;
    static short failedTest;

    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if(!iInvokedMethod.getTestMethod().getMethodName().equals("initCalculator"))
        System.out.println("Test "+ iInvokedMethod.getTestMethod().getMethodName()+" has been started at "+timeConverter(iTestResult.getStartMillis()));
    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if(!iInvokedMethod.getTestMethod().getMethodName().equals("initCalculator"))
        System.out.println("Test "+ iInvokedMethod.getTestMethod().getMethodName()+" is done at "+timeConverter(iTestResult.getEndMillis())+". ");
    }


    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("New suit \""+iSuite.getName()+"\" has started.");
    }

    @Override
    public void onFinish(ISuite iSuite) {
        System.out.println(iSuite.getName()+" has finished.");
        System.out.println(succededTest+" test were succeded, "+failedTest+" were failed.\n");
    }
    String timeConverter(long millis){

        Instant instant = Instant.ofEpochMilli ( millis);
        ZonedDateTime zdt = ZonedDateTime.ofInstant ( instant , ZoneOffset.of("+03:00:00"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ( "HH:mm:ss:SSS" );
        String output = formatter.format ( zdt );
        return output;
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
    succededTest++;
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        failedTest++;
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}
