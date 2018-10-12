package browserManager;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class browserManager {

    private static browserManager ourInstance =null;
    private WebDriver session;

    public static browserManager getInstance() {
        if (ourInstance ==null)
            ourInstance = new browserManager();
        return ourInstance;
    }

    private browserManager() {
        session = FactoryBrowser.make("chrome").create();
    }

    public WebDriver getSession(){
        return session;
    }

}
