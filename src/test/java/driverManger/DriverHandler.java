package driverManger;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DriverHandler {

    private static DriverHandler ourInstance = null;
    public static WebDriver myBrowser;

    public static DriverHandler getDriver() {
        if (ourInstance == null)
            ourInstance=new DriverHandler();

        return ourInstance;
    }

    private DriverHandler() {
        myBrowser = FactoryBrowser.make("chrome").create();
        // wait implicito
        myBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        myBrowser.quit();
    }


}
