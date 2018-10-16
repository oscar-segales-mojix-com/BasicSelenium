import org.junit.Assert;
import org.junit.Test;
import pages.*;


public class RemoveProject extends TestBase{

    MainPage mainPage =new MainPage();
    LoginPage loginPage = new LoginPage();
    MenuPage menuPage = new MenuPage();
    LeftMenuPage leftMenuPage = new LeftMenuPage();
    ProjectFormPage projectFormPage = new ProjectFormPage();
    @Test
    public void verifyCreateProject() {

        String expectedResultName="TEST50";
        mainPage.loginButton.click();
        loginPage.emailTextBox.type("eynar.pari@gmail.com");
        loginPage.passwordTextBox.type("Control123!");
        loginPage.loginButton.click();
        this.waitTimeSeconds(2);

        leftMenuPage.addNewProjectButton.click();
        leftMenuPage.nameProjectText.type(expectedResultName);
        leftMenuPage.addButton.click();
        this.waitTimeSeconds(2);
        leftMenuPage.selectProject(expectedResultName);
        leftMenuPage.menuIcon.click();
        leftMenuPage.deleteButton.click();

        browserManager.browserManager.getInstance().getSession().switchTo().alert().accept();
        this.waitTimeSeconds(2);

        Assert.assertTrue("Projecto no fue borrado",leftMenuPage.isDisplayedProj(expectedResultName));
    }

}
