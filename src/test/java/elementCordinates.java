import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class elementCordinates {
    @Test
    public void rect(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();

        WebElement img = driver.findElement(By.xpath("//div[@id='initialView']"));
        Rectangle rect = img.getRect();

        System.out.println(rect.getHeight());
        System.out.println(rect.getWidth());
        System.out.println(rect.getX());
        System.out.println(rect.getY());



    }

}
