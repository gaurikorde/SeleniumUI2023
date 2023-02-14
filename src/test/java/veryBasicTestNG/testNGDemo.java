package veryBasicTestNG;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class testNGDemo implements ITestListener {

    @Test(priority = -5,dependsOnMethods = "testng_two")
    public void testng_one(){
        System.out.println("Test one");
    }
    @Test(priority = 5)
    public void testng_two(){
        System.out.println("Test two");
             Assert.fail("Fail");


    }
    @Test(priority = 6*3)
    public void testng_three(){

        System.out.println("Test three");
      //  throw new SkipException("Skipping Test"); //forcefully skip test
    }
    @Test(priority = 5)
    public void testng_four(){
        System.out.println("Test four");
    }



}
