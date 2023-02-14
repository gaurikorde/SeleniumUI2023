package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class selActions {
    WebDriver driver = new ChromeDriver();

@Test
    public void basicActions() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver","C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://output.jsbin.com/usidix/1");
   // driver.findElement(By.cssSelector("input[type = /'button/']")).click();
    driver.findElement(By.xpath("//input[@type='button']")).click();
    Thread.sleep(1000);
  //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    String alertText = driver.switchTo().alert().getText();
    System.out.println(alertText);
    driver.switchTo().alert().accept();
}

@Test
    public void complexActions(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();

    WebElement we = driver.findElement(By.id("email"));

    Actions act = new Actions(driver) ;
    act.moveToElement(we).click()
            .keyDown(we, Keys.SHIFT)
            .sendKeys("hello")
            .keyUp(we,Keys.SHIFT)
            .build().perform();

}

    @Test
    public void mouseMove() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.way2automation.com/");
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"menu-item-27617\"]/a/span[2]"));
        Actions act = new Actions(driver);
        act.moveToElement(menu).perform();
}

    @Test
    public void jqueryslider() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/slider/");
        driver.manage().window().maximize();
        WebElement frm = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
        new Actions(driver).dragAndDropBy(slider,400,0).perform();

    }


    @Test
    public void resizeelement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();
        WebElement frm = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
        new Actions(driver).dragAndDropBy(slider, 300, 300).perform();

    }

    @Test
    public void dragndrop() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        WebElement frm = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        new Actions(driver).dragAndDrop(drag,drop).perform();

    }

    @Test
    public void rightclick() {
      //  WebDriver driver = new ChromeDriver();
        driver.get("https://deluxe-menu.com/popup-mode-sample.html");
        driver.manage().window().maximize();
        WebElement img = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));

        new Actions(driver).contextClick(img).perform();

    }

    @Test
    public void keyboard_enter() {
       // WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kordepgauri@gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);

//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.ENTER).perform();

    }

    @AfterTest
    public void cls(){
    driver.quit();
    }


}
