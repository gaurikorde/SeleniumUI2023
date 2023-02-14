package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.Duration;

public class selWaits {

    @Test
    public void implicitWaitSel(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicitWait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); //explicitWait
        Wait <WebDriver> wait1 = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .withMessage("No element found")
                .ignoring(NoSuchElementException.class);
       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kordepgauri");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("kordepgauri");
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).sendKeys("kordepgauri");



    }

}
