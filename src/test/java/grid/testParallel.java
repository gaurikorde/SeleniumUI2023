package grid;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class testParallel {

    protected static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
    public Capabilities capabilities;
    public WebDriver getDriver() {
        return driver.get();
    }


    @Parameters({"browser"})
    @Test
    public void doSearch(String browser) throws InterruptedException, MalformedURLException {
        if(browser.equals("firefox")) {
            capabilities = new FirefoxOptions();
        } else if (browser.equals("chrome")) {
            capabilities = new ChromeOptions();
        } else if (browser.equals("edge")) {
            capabilities = new EdgeOptions();
        }

        driver.set(new RemoteWebDriver(new URL("http://192.168.1.100:4444/"), capabilities));
        getDriver().get("http://google.com");
        getDriver().findElement(By.name("q")).sendKeys("Hello Grid "+browser);
        Thread.sleep(1000);
        getDriver().quit();
    }


}
