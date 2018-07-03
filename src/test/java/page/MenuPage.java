package page;

import control.LinkText;
import org.openqa.selenium.By;

public class MenuPage {

    public LinkText iPhoneAppLink;
    public LinkText upgradeLink;
    public LinkText settingLink;
    public LinkText logoutLink;

    public MenuPage(){
        logoutLink=new LinkText(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]"));
    }
}
