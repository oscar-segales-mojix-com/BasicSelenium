import driverManger.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MainPage;
import page.MenuPage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ExampleTestNg extends BaseTestCase {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    MenuPage menuPage = new MenuPage();

    @Test
    public void valid_UserCredential() throws InterruptedException {
        // steps
        mainPage.login.Click();
        loginPage.userTextBox.Set("eynar.pari@gmail.com");
        loginPage.pwdTextBox.Set("Control123");
        loginPage.loginButton.Click();
        // Verificacion
        Assert.assertTrue(menuPage.logoutLink.isDisplayed(),"ERROR! LoginFailed");
        String actualResult = menuPage.logoutLink.getText();
        String expectedResult ="Logout";
        Assert.assertEquals(actualResult,expectedResult,"ERROR ! Login Failed");
        Thread.sleep(5000);
    }

}
