package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selNavigate {

    @Test
    public void demo() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "http://www.facebook.com";
        //driver.navigate().to(URL);
        driver.get(URL);
        driver.findElement(By.linkText("Forgotten password?")).click();
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
    }


    @Test
    public void tbl() {
        //System.setProperty("webdriver.chrome.driver", "C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.w3schools.com/html/html_tables.asp";
        driver.get(URL);
        //driver.manage().window().maximize();
        int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        int colCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();

        for (int i=1;i<rowCount;i++){
            for (int j=1;j<=colCount;j++){
            String Actual = driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
                System.out.println(Actual);
            if(Actual.equals("Italy"))
                {
                    System.out.println("Test Pass with "+i +" "+j);
                    break;
                }

            }
        }



    }
}
