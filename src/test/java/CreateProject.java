import org.junit.Assert;
import org.junit.Test;
import pages.*;


public class CreateProject extends TestBase{

    MainPage mainPage =new MainPage();
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();
    LeftMenuPage leftMenuPage = new LeftMenuPage();
    ProjectFormPage projectFormPage = new ProjectFormPage();
    @Test
    public void verifyCreateProject() {

        String expectedResultName="ABC123";
        mainPage.loginButton.click();
        loginPage.emailTextBox.type("eynar.pari@gmail.com");
        loginPage.passwordTextBox.type("Control123!");
        loginPage.loginButton.click();
        this.waitTimeSeconds(2);

        leftMenuPage.addNewProjectButton.click();
        leftMenuPage.nameProjectText.type(expectedResultName);
        leftMenuPage.addButton.click();
        this.waitTimeSeconds(2);
        String actualResultName=projectFormPage.nameProjectLabel.getValue();
        Assert.assertEquals("ERROR ! El nombre del projecto es incorrecto",expectedResultName,actualResultName);


    }

}
