import driverManager.DriverManager;
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

public class ExampleTestNg extends BaseTestCase{

    public MainPage mainPage = new MainPage();
    public LoginPage loginPage = new LoginPage();
    public MenuPage menuPage = new MenuPage();

    @Test
    public void valid_UserCredential() {
        mainPage.loginLink.click();
        loginPage.userTextBox.set("user");
        loginPage.pwdTextBox.set("pwd");
        loginPage.loginButton.click();
        // Verification
        Assert.assertTrue(menuPage.logoutLink.isDisplayed(),"ERROR !! Login Failed");

        String actualResult = menuPage.logoutLink.getTextValue();
        String expectedResulst = "Logout";

        Assert.assertEquals(actualResult,expectedResulst,"ERROR ! Logout Link is not displayed");

    }
}
