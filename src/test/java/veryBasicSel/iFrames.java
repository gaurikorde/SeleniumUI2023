package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class iFrames {

    @Test
    public void frm_remaning(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame("1");
        driver.findElement(By.id("w3loginbtn")).click();


        driver.quit();
    }
}
