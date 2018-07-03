import driverManger.DriverHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class BaseTestCase {


    ITestResult result;
    @BeforeMethod
    public void openBrowser() {
        DriverHandler.getDriver().myBrowser.get("http://todo.ly/");

    }

    @AfterMethod
    public void closeBrowser() {

        result = Reporter.getCurrentTestResult();

         if (result.getStatus()==result.FAILURE){
             TakesScreenshot takesScreenshot = (TakesScreenshot) DriverHandler.getDriver().myBrowser;
             File imagen=takesScreenshot.getScreenshotAs(OutputType.FILE);
         }
        DriverHandler.getDriver().closeBrowser();
    }

}
