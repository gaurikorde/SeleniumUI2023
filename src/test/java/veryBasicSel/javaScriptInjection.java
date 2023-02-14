package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class javaScriptInjection {
    @Test
    public void myfun() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
        driver.switchTo().frame("iframeResult");
        ((JavascriptExecutor) driver).executeScript("myFunction()");
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].style.border='3px solid red'",driver.findElement(By.id ("mySubmit")));



    }
}
