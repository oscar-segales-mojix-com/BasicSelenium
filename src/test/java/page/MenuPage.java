package page;

import controlSelenium.Link;
import org.openqa.selenium.By;

public class MenuPage {

    public Link logoutLink;

    public MenuPage(){
        logoutLink = new Link(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]"));
    }
}
