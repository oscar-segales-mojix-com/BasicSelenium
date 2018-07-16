import driverManager.DriverManager;
import io.qameta.allure.*;
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

@Feature("Feature : User")
@Epic("Epic : Administration")
public class ExampleTestNg extends BaseTestCase{

    public MainPage mainPage = new MainPage();
    public LoginPage loginPage = new LoginPage();
    public MenuPage menuPage = new MenuPage();

    @Owner("Eynar Pari")
    @Story("Story: ABC")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Description : this test is to verify the login in the todo.ly page with correct user and password")
    @Test (priority = 1,description = "Title : Verify User is able to login with user and password")
    @Issue("JIRA 1234")
    @TmsLink("http://jira.com/123123")
    @Link("link bug")

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
