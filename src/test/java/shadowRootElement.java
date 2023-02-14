import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class shadowRootElement {

    @Test
    public void lct(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("chrome://downloads/");

//        WebElement root = driver.findElement(By.xpath("/html/body/downloads-manager"));
//        WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root);
//
//        WebElement root2 = shadowRoot1.findElement(By.id("toolbar"));
//        WebElement shadowRoot2 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root2);
//
//        WebElement root3 = shadowRoot2.findElement(By.xpath("//*[@id=\"toolbar\"]"));
//        WebElement shadowRoot3 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root3);
//
//        WebElement root4 = shadowRoot3.findElement(By.xpath("//*[@id=\"search\"]"));
//        WebElement shadowRoot4 = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",root4);
//

        WebElement input = (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return document.querySelector('downloads-manager')" +
                ".shadowRoot.querySelector('downloads-toolbar').shadowRoot.querySelector('cr-toolbar')" +
                ".shadowRoot.querySelector('cr-toolbar-search-field')" +
                ".shadowRoot.querySelector('#searchInput')");

        input.sendKeys("Holla");



        //shadowRoot4.findElement(By.id("searchInput")).sendKeys("Holla");

    }

}
