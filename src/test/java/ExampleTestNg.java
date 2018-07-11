import driverManger.DriverHandler;
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
public class ExampleTestNg extends BaseTestCase {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();
    MenuPage menuPage = new MenuPage();

    @Owner("Eynar Pari")
    @Story("Story: ABC")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Description : this test is to verify the login in the todo.ly page with correct user and password")
    @Test (priority = 1,description = "Title : Verify User is able to login with user and password")
    @Issue("JIRA 1234")
    @TmsLink("http://jira.com/123123")
    @Link("link bug")
    public void valid_UserCredential() throws InterruptedException {
        // steps
        mainPage.login.Click();
        loginPage.userTextBox.Set("eynar.pari@gmail.com");
        loginPage.pwdTextBox.Set("Control1234");
        loginPage.loginButton.Click();
        // Verificacion
        Assert.assertTrue(menuPage.logoutLink.isDisplayed(),"ERROR! LoginFailed");
        String actualResult = menuPage.logoutLink.getText();
        String expectedResult ="Logout";
        Assert.assertEquals(actualResult,expectedResult,"ERROR ! Login Failed");
        Thread.sleep(5000);
    }

}
