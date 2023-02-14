package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //partial  click is case sensative
        driver.get("https://demo.guru99.com/test/link.html");
        driver.findElement(By.partialLinkText("here")).click();

                //click sendkeys
        driver.get("https://demo.guru99.com/test/login.html");
        driver.findElement(By.id("email")).sendKeys("Gauri");
        driver.findElement(By.id("passwd")).sendKeys("Korde");

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("passwd")).clear();

        //radio button check box
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
        WebElement checkboxclick = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        checkboxclick.click();

        if (checkboxclick.isSelected())
        {
            System.out.println("Check box selected");
        } else {
            System.out.println("Check box  not selected");
        }

        driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();









    }
}
