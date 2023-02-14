import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SVG {
    public static void main(String[] args) throws InterruptedException, ParseException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=covid+cases+in+india&rlz=1C1VDKB_enIN1015IN1016&oq=covid+cases+in+india&aqs=chrome.0.69i59j0i131i433i512l3j0i512j0i131i433i512j0i512j0i131i433i512j0i512l2.3526j0j7&sourceid=chrome&ie=UTF-8");

        WebElement el = driver.findElement(By.xpath("//*[local-name()='svg' and @class = 'uch-psvg']"));
        int topleftY = ((el.getSize().getHeight())/2) - (el.getSize().getHeight());
        int topleftX = ((el.getSize().getWidth())/2) - (el.getSize().getWidth());;
        Actions act = new Actions(driver);

        String startDate = "20-03-2020";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        Date d1= sdf.parse(startDate);
        Date d2=  new Date();
        long dateDifference = TimeUnit.MILLISECONDS.toDays(d2.getTime()-d1.getTime());

        for (int i = 0 ;i<dateDifference;i++) {
            act.moveToElement(el, topleftX+i, topleftY).perform();
            String data = driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
            System.out.println(data);
            //Thread.sleep(10);


        }

    }
}
