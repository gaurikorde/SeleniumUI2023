package veryBasicSel;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class screenshot {

public static WebDriver driver;

    public static void captureScreenShot() throws IOException {

        Date d = new Date();
        System.out.println(d.toString().replace(":","_").replace(" ","_")+".jpg");
        String fileName = d.toString().replace(":","_").replace(" ","_")+".jpg";
        System.out.println(fileName);
        File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("./ss/"+fileName));
    }



    @Test
    public void check() throws IOException {
        driver = new FirefoxDriver(); //need to caste the driver with hasfull..or firefox
        //firefox driver obviously works only on firefox
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        File pgss = ((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
       // File pgss = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pgss,new File("./ss/pgs.jpg"));


        File pgss_1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(pgss_1,new File("./ss/pgs_1.jpg"));


        WebElement box = driver.findElement(By.id("searchInput"));
        File ss = box.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("./ss/s.jpg"));

        captureScreenShot();


    }
}