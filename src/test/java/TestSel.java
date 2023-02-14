import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSel {


    @Test
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");

        //Close browser before action
        //driver.quit(); no such session- once driver is called post close()
        String expectedtitle = "Facebook – log in or sign up";
        String actualtitle = driver.getTitle();
        System.out.println(driver.getTitle());

        if (actualtitle.contentEquals(expectedtitle))
        {
            System.out.println("Test Pass");
        }
        else
            System.out.println("Test Fail");

        //find the  size of element which doesn't exist with elementS
        List<WebElement> list =
                driver.findElements(By.xpath("//button[@class='signup']"));
        System.out.println(list.size()); //zero - no error it will give zero even there is no element such like that

        String tagname = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagname);
        String password = driver.findElement(By.cssSelector("Password")).getTagName();
        driver.quit();


    }
}


