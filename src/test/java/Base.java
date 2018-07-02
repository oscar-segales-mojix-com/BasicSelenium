import driverManger.DriverHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class Base {
    ITestResult result;

    @BeforeMethod
    public void openBrowser() {

      //  DriverHandler.getDriver().myBrowser().get("http://todo.ly/");
    }

    @AfterMethod
    public void closeBrowser() {
        result =Reporter.getCurrentTestResult();
        System.out.println("status "+result.getStatus());
        System.out.println("if "+result.isSuccess()       );
        System.out.println("abc "+result.SUCCESS);

        if (!result.isSuccess()) {

        }
        TakesScreenshot screenshot = (TakesScreenshot) DriverHandler.getDriver().myBrowser();
        File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(SrcFile, new File("D:\\screenshot.png"));
        //   DriverHandler.getDriver().closeBrowser();
    }
}
