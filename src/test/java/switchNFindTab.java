import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class switchNFindTab {

    public static void main(String[] args) {


        System.out.println(SeleniumManager.getInstance().getDriverPath("geckodriver"));
        System.out.println(SeleniumManager.getInstance().getDriverPath("chromedriver"));

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.way2automation.com/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.gmail.com/");

        System.out.println(driver.getWindowHandles().size());

        Set<String> winids = driver.getWindowHandles();
        Iterator<String> iterator = winids.iterator();

        List<String> winIndex = new ArrayList<String>();
        while (iterator.hasNext()) {

            winIndex.add(iterator.next());
        }

        driver.switchTo().window(winIndex.get(0));
        System.out.println("First window title is :" + driver.getTitle());

        driver.close();

        driver.switchTo().window(winIndex.get(1));
        System.out.println("second window title is :" + driver.getTitle());

        driver.close();


        driver.switchTo().window(winIndex.get(2));
        System.out.println("third window title is :" + driver.getTitle());


        driver.quit();

    }
}