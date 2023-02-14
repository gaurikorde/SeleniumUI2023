package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class testRemote {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //ChromeOptions opt = new ChromeOptions();
        FirefoxOptions opt = new FirefoxOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.100:4444"),opt);

       // WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("Hello Grid");
        Thread.sleep(1000);
        driver.quit();

    }
}
