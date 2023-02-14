package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator.*;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class selRelativeLocators {

    @Test
    public void lctr_abv(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/way2auto_jquery/registration.php");
        driver.findElement(with(By.tagName("input")).below(By.name("name"))).sendKeys("text");
    }
}
