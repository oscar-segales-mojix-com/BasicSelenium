import org.junit.After;
import org.junit.Before;

public class TestBase {

    @Before
    public void openBrowser() {
        browserManager.browserManager.getInstance().getSession().get("http://todo.ly/");  // Open Browser In Page
    }


    @After
    public void closeBrowser() {
        browserManager.browserManager.getInstance().getSession().quit();
    }

    public void waitTimeSeconds(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
