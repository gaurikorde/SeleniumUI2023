package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class authentication {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ((HasAuthentication) driver).register(UsernameAndPassword.of("admin","admin"));
        driver.get("https://the-internet.herokuapp.com/basic_auth");
    }
}
