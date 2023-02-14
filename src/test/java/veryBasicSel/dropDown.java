package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class dropDown {

    @Test
    public void selectdrop(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Select select = new Select (driver.findElement(By.name("country")));
        select.selectByValue("INDIA");

    }


        @Test
            public void selectMulti(){
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.wikipedia.org/");
            List<WebElement> ele = driver.findElements(By.tagName("option"));
            System.out.println(ele.size());
            System.out.println(ele.get(7));
            WebElement box = driver.findElement(By.xpath("//div[@class='footer']"));
            List<WebElement> alllinks = box.findElements(By.tagName("a"));
            System.out.println(alllinks.size());

            for (WebElement links : alllinks){

                System.out.println(links.getText());

            }
        }

}
