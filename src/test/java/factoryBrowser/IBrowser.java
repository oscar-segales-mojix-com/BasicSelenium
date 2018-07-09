package factoryBrowser;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IBrowser {
    public WebDriver create() throws MalformedURLException;
}
