import driverManager.DriverManager;
import org.openqa.selenium.By;
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




    @BeforeMethod
    public void openBrowser() {

    }

    @Test
    public void valid_UserCredential() {
        DriverManager.getInstance().mydriver.get("http://todo.ly/");
        DriverManager.getInstance().mydriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();
        DriverManager.getInstance().mydriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]")).sendKeys("test");
        DriverManager.getInstance().mydriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]")).sendKeys("test");
        DriverManager.getInstance().mydriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]")).click();
    }

    @AfterMethod
    public void closeBrowser() {
        DriverManager.getInstance().closeBrowser();
    }
}
