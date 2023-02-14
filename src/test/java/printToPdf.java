import org.apache.xmlbeans.impl.values.XmlAnyTypeImpl;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class printToPdf {

    public static void main(String[] args) throws IOException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("headless");

        WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        //supported only in headless mode
        Pdf pdf = ((PrintsPage)driver).print(new PrintOptions());
        Files.write(Paths.get("./sel.pdf"),OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
    }
}
