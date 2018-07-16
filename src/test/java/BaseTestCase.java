import driverManager.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
public class BaseTestCase {

        ITestResult result;

        @BeforeMethod
        public void openBrowser() {
            DriverManager.getInstance().mydriver.get("http://todo.ly/");
        }


        @AfterMethod
        public void closeBrowser() {
            result =Reporter.getCurrentTestResult();
            saveScreenshotPNG( DriverManager.getInstance().mydriver);
            saveTextLog("failed and screenshot taken! LogsFailed ! ");
            attachHtml("<html><body>EYNAR HTML <br> ABC</body></html>");
            DriverManager.getInstance().closeBrowser();
        }

        //Text attachments for Allure
        @Attachment(value = "Page screenshot", type = "image/png")
        public byte[] saveScreenshotPNG (WebDriver driver) {
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        }

        //Text attachments for Allure
        @Attachment(value = "{0}", type = "text/plain")
        public static String saveTextLog (String message) {
            return message;
        }

        //HTML attachments for Allure
        @Attachment(value = "{0}", type = "text/html")
        public static String attachHtml(String html) {
            return html;
        }


    }


