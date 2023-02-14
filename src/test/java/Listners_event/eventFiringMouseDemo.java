package Listners_event;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.events.internal.EventFiringMouse;


public class eventFiringMouseDemo {

    @Test
    public void eventcl(){
        WebDriver driver = new FirefoxDriver();
        mouseEventCall tmel = new mouseEventCall();
        EventFiringWebDriver efwd = new EventFiringWebDriver(driver);
        efwd.register(tmel);

    //EventFiringMouse; - this is deprecated, can use the selenium 4 new features

    }
}
