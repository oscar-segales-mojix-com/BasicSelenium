import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;
import pages.MainPage;
import pages.MenuPage;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class ExampleJunit extends TestBase{

    MainPage mainPage =new MainPage();
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();
    @Test
    public void valid_UserCredential() {
        mainPage.loginButton.click();
        loginPage.emailTextBox.type("email");
        loginPage.passwordTextBox.type("pwd");
        loginPage.loginButton.click();


        // Verificacion
        Assert.assertTrue("ERROR ! Login was Failed !! ",
                menuPage.logout.isDisplayed());


    }

}
