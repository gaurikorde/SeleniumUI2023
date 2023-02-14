package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class textCaptcha {

    @Test
    public void captchaAdd(){
        WebDriver driver = new ChromeDriver();
        for (int i =100,j= 100;i<=1920 && j<=1080;i=i+20,j=j+10){
            {
                driver.manage().window().setSize(new Dimension(i,j));
            }
        }

        driver.get("https://timesofindia.indiatimes.com/poll.cms");
        WebElement captcha = driver.findElement(By.id("mathq2"));
        System.out.println(captcha.getText());
        String cpt = captcha.getText();
        String[] num = cpt.split(" ");
        System.out.println(num.length);
        int num1 = Integer.parseInt(num[0]);
        int num2 = Integer.parseInt(num[2]);

       System.out.println(num1+num2);

        for(int i=0 ; i<num.length;i++){
            System.out.println(i+ "+Value at  "+ num[i]);
        }
    }
}
