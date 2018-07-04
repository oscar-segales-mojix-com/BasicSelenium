import driverManager.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestCase {

    @BeforeMethod
    public void openBrowser() {
        DriverManager.getInstance().mydriver.get("http://todo.ly/");
    }

    @AfterMethod
    public void closeBrowser() {
        DriverManager.getInstance().closeBrowser();
    }

}
