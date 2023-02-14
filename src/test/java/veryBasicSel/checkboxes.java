package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class checkboxes {

    public static WebDriver driver;

    public static boolean isPresentby(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Throwable t) {
            return false;
        }
    }

        @Test
        public void checkloop () {
            driver = new FirefoxDriver();
            driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
            driver.manage().window().maximize();

            WebElement box = driver.findElement(By.xpath("//div[@class='display']"));
            List<WebElement> checkb = box.findElements(By.name("sports"));
            for(WebElement ckh : checkb){
                ckh.click();
            }

        }

    }


