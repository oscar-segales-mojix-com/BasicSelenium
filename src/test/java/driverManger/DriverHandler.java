package driverManger;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverHandler {

    private static DriverHandler ourInstance = null;
    private static WebDriver myBrowser;

    public static DriverHandler getDriver() {
        if (ourInstance == null)
            ourInstance=new DriverHandler();

        return ourInstance;
    }

    private DriverHandler() {
        try {
            myBrowser = FactoryBrowser.make("chromesss").create();
            myBrowser().manage().window().maximize();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        myBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver myBrowser(){
        return myBrowser;
    }
    public void closeBrowser()
    {
        myBrowser.quit();
    }


}
