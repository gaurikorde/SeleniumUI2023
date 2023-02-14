package veryBasicTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

public class paralleTestWithDataProvider {

    @Test(dataProvider="DP",invocationCount = 3)
    public void doLogin(String b) throws InterruptedException {
        Date date = new Date();
        System.out.println("Browser Name: "+b+"---"+date);
        Thread.sleep(2000);

    }

    @DataProvider(parallel = true,name="DP")
    public static Object[][] getData() {

        Object[][]  data = new Object[2][1];
        data[0][0]="Chrome";
        data[1][0]="firefox";

        return data;

    }


}
