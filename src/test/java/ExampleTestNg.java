import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleTestNg {


    private ChromeDriver driver;
    WebElement element;


    @BeforeMethod
    public void openBrowser() {
        String PATH_PROJECT = new File(".").getAbsolutePath().replace(".", "");
        System.setProperty("webdriver.chrome.driver", (PATH_PROJECT+"src+test+java+drivers+windows+chromedriver.exe").replace("+",File.separator));

       // System.setProperty("webdriver.chrome.driver", PATH_PROJECT+"src\\test\\java\\drivers\\windows\\chromedriver.exe");
        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("credentials_enable_service", false);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--enable-memory-info");
        options.addArguments("--no-sandbox");
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void valid_UserCredential() {
        driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
