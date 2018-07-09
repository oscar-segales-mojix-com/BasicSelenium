import io.qameta.allure.*;
import org.junit.experimental.categories.Category;
import org.testng.Assert;
import org.testng.annotations.*;
import page.LoginPage;
import page.MainPage;

import java.lang.reflect.Method;


@Feature("Feature : User")
@Epic("Epic : Administration")
public class ExampleTestNg extends Base {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Owner("Eynar Pari")
    @Story("Story: ABC")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Description : this test is to verify the login in the todo.ly page with correct user and password")
    @Test (priority = 1,description = "Title : Verify User is able to login with user and password")
    @Issue("JIRA 1234")
    @TmsLink("http://jira.com/123123")
    @Link("link bug")

    public void valid_UserCredential() throws InterruptedException {

        mainPage.login.Click();
        loginPage.userTextBox.Set("test");
        loginPage.pwdTextBox.Set("test");
        loginPage.loginButton.Click();
        Thread.sleep(5000);
        Assert.assertTrue(false);
    }
}
