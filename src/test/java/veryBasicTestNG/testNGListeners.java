package veryBasicTestNG;

import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class testNGListeners implements ITestNGListener {

    // When Test case get passed, this method is called.
    //@Override
    public void onTestSuccess(ITestResult Result)
    {
        Reporter.log("Sceenshot link");
        System.out.println("The name of the testcase passed is :"+Result.getName());
    }


    public void onTestFailure(ITestResult Result)
    {
        Reporter.log("Screenshot link");
        System.out.println("The name of the testcase Fail is :"+Result.getName());

    }
}
