package veryBasicSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class webTables {

    @Test
    public void accessWithAttribute() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        String text = driver.findElement(By.xpath("//table[@width=270]/tbody/tr[2]")).getText();
        System.out.println(text);
    }

    @Test
    public void dynamicWebTable() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");


        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println(col.size());

        List<WebElement> rw = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
        System.out.println(rw.size());


        WebElement wtbl = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowtext = wtbl.getText();
        System.out.println(rowtext);


        WebElement wtblrw = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String rowtextrw = wtblrw.getText();
        System.out.println(rowtextrw);

    }

    @Test
    public void fetchMaxVal() throws ParseException {

        double r = 0, m = 0;
        System.setProperty("webdriver.chrome.driver", "C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");

        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println(col.size());

        List<WebElement> rw = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
        System.out.println(rw.size());

        for (int i = 1; i < rw.size(); i++) {
            String max = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[" + (i + 1) + "]/td[4]")).getText();
            NumberFormat f = NumberFormat.getNumberInstance();
            Number num = f.parse(max);
            String maxnum = max.toString();
            m = Double.parseDouble(max);
            if (m > r) {
                r = m;
            }
        }
        System.out.println("Maximum current price is : " + r);

    }


    @Test
    public void allValfromTbl() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Gauri K/Desktop/selenium_prj_stuff/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/table.html");

        WebElement mytable = driver.findElement(By.xpath("/html/body/table/tbody"));
        //To locate rows of table.
        List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
        int rows_count = rows_table.size();
        System.out.println(rows_count);

        for (int row = 0; row < rows_count; row++) {
            //To locate columns(cells) of that specific row.
            List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
            int columns_count = Columns_row.size();
            System.out.println("Number of cells In Row " + row + " are " + columns_count);
            //Loop will execute till the last cell of that specific row.
            for (int column = 0; column < columns_count; column++) {
                // To retrieve text from that specific cell.
                String celtext = Columns_row.get(column).getText();
                System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
            }
        }
    }
}

