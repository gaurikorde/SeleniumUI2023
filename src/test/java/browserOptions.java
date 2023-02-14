import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.util.Collections;


public class browserOptions {

       @Test
       public void headlessExecution() {
        ChromeOptions opt = new ChromeOptions();
       // opt.addArguments("--headless");
        opt.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(opt);
        opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        driver.get("https://www.selenium.dev/");
        System.out.println(driver.getTitle());
    }
        @Test
        public void byPassCertInsecure(){
            //works only with firefox not chrome
          FirefoxOptions opt = new FirefoxOptions();
          WebDriver driver = new FirefoxDriver(opt);
          //by pass insecure certificate
          //driver.switchTo().newWindow(WindowType.TAB);
          opt.setAcceptInsecureCerts(true);   //accept insecure certificate
          driver.get("https://expired.badssl.com/");
      }

        @Test
        public void disblinfobar(){

            ChromeOptions opt = new ChromeOptions();
            opt.setExperimentalOption("useAutomationExtension", false);
            opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            WebDriver driver = new ChromeDriver(opt);
            driver.get("https://www.google.com");

//            Below disable infobar no more supported by chromium
//            opt.addArguments("disable-infobar");
//            WebDriver driver = new ChromeDriver(opt);
//            driver.get("https://www.google.com");
        }


    @Test
    public void pageLdStratrgy() {

      FirefoxOptions opt = new FirefoxOptions();
      opt.setPageLoadStrategy(PageLoadStrategy.EAGER); //DOM access is ready, but other resources like images may still be loading
      //opt.setPageLoadStrategy(PageLoadStrategy.NORMAL); //Used by default, waits for all resources to download
      //opt.setPageLoadStrategy(PageLoadStrategy.NONE); //	Does not block WebDriver at all
      WebDriver driver = new FirefoxDriver();
  }
    @Test
    public  void incognitomode(){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("incognito");
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.google.com");
    }




    }



