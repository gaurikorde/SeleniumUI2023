package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class tabsNpopups_remaning_lecture175 {

    @Test
    public void tabs(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.encodedna.com/javascript/demo/open-new-window-using-javascript-method.htm");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/p[4]/input")).click();


    }
}
