package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alert_jscript {

    @Test
    public void alert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.id("login1")).sendKeys("122");
        driver.findElement(By.name("proceed")).click();
        driver.switchTo().alert().accept();
    }
}