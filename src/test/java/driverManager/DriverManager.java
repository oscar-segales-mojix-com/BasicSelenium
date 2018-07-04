package driverManager;

import browser.FactoryBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverManager {

    private static DriverManager ourInstance = null;
    public static WebDriver mydriver;
    public static DriverManager getInstance() {
         if (ourInstance==null)
             ourInstance=new DriverManager();

        return ourInstance;
    }

    private DriverManager() {


        mydriver = FactoryBrowser.make("chrome").create();
        mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        mydriver.quit();
    }
}
