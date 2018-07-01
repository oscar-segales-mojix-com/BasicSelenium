import driverManger.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleTestNg {




    @BeforeMethod
    public void openBrowser() {

    }

    @Test
    public void valid_UserCredential() throws InterruptedException {

        DriverHandler.getDriver().myBrowser.get("http://todo.ly/");

        DriverHandler.getDriver().myBrowser.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();
        DriverHandler.getDriver().myBrowser.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]")).sendKeys("usr");
        DriverHandler.getDriver().myBrowser.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).sendKeys("pwd");
        DriverHandler.getDriver().myBrowser.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]")).click();
        Thread.sleep(5000);
    }


    @AfterMethod
    public void closeBrowser() {
        DriverHandler.getDriver().closeBrowser();
    }
}
