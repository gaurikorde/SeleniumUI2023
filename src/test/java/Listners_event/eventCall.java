package Listners_event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class eventCall {

    @Test
    public void eventcl(){

        WebDriver driver = new FirefoxDriver();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        eventHandler handler = new eventHandler();
        eventDriver.register(handler);
        eventDriver.get("https://www.browserstack.com/");
       // driver.manage().window().maximize();
        WebElement ele =  eventDriver.findElement(By.xpath("//*[text()='Get started free']"));
        ele.click();
        eventDriver.quit();
        eventDriver.register(handler);
    }



}

