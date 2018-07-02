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
import page.MainPage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleTestNg extends Base {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();


    @Test (priority = 1)
    public void valid_UserCredential() throws InterruptedException {
        /*mainPage.login.Click();
        loginPage.userTextBox.Set("test");
        loginPage.pwdTextBox.Set("test");
        loginPage.loginButton.Click();
        Thread.sleep(5000);*/
    }
}
