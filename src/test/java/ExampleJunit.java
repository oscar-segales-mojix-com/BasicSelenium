import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.MainPage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ExampleJunit {

    MainPage mainPage;
    LoginPage loginPage;

    @Before
    public void openBrowser() {
        browserManager.browserManager.getInstance().getSession().get("http://todo.ly/");  // Open Browser In Page
        mainPage =new MainPage();
        loginPage = new LoginPage();

    }

    @Test
    public void valid_UserCredential() {
        mainPage.loginButton.click();
        loginPage.emailTextBox.type("email");
        loginPage.passwordTextBox.type("pwd");
        loginPage.loginButton.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeBrowser() {
        browserManager.browserManager.getInstance().getSession().quit();
    }
}
