package veryBasicSel;

import javafx.scene.chart.ScatterChart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class isElePresent {
    public static WebDriver driver;

    public static boolean isPresent(String locator) {
        try {
            driver.findElement(By.xpath(locator));
            return true;
        } catch(Throwable t)
        {
            return false;
        }
    }


    public static boolean isPresentby(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch(Throwable t)
        {
            return false;
        }
    }


    @Test
    public void check(){
        driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        System.out.println(isPresent("//div[@class='footer']"));
        System.out.println(isPresentby(By.xpath("//div[@class='footere']")));

        Boolean isPresent = driver.findElements(By.xpath("//div[@class='fopoter']")).size() > 0;
        System.out.println(isPresent);
    }


}