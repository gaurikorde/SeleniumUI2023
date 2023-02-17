import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class brokenLink {

    public static void main(String[] args) {
        //test for jenkins
        System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        List<WebElement> listAm = driver.findElements(By.tagName("a"));
        System.out.println("No of links: "+listAm.size());

        List<String> urlList = new ArrayList<>();


            for(WebElement e : listAm) {
                String url=e.getAttribute("href");
                urlList.add(url);
                //checkbrokenlinks(url);
            }
            long stTime = System.currentTimeMillis();
            urlList.parallelStream().forEach(e -> checkbrokenlinks(e));
            long EndTime = System.currentTimeMillis();

        System.out.println("Time taken "+(EndTime-stTime));

        //driver.quit();
    }

    public static void checkbrokenlinks (String listAm){
        try{
        URL url = new URL(listAm);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode()>=400){
                System.out.println(listAm+ "------>"+httpURLConnection.getResponseMessage());
        }else
            {
                System.out.println( listAm+ "------>"+httpURLConnection.getResponseMessage());
            }

        }

        catch(Exception e ){
            System.out.println("Exception occured");
        }
        }
    }





