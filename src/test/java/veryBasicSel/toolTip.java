package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class toolTip {

    @Test
    public void tTip()
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/tooltip.html");

        WebElement home = driver.findElement(By.xpath("//div[@class='site-name']/a"));
        String str = home.getAttribute("title");
        System.out.println(str);
        WebElement dn = driver.findElement(By.xpath("//*[@id=\"download_now\"]"));
        Actions act = new Actions(driver);
        act.moveToElement(dn).build().perform();
        WebElement tl = driver.findElement(By.xpath("//div[@class='tooltip']"));
        System.out.println(tl.getText());



    }
}
