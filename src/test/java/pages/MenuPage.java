package pages;

import control.Link;
import org.openqa.selenium.By;

public class MenuPage {

    public Link iPhoneApp;
    public Link upgradeToPro;
    public Link settings;
    public Link logout;

   public  MenuPage(){
       iPhoneApp = new Link(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_PanelHeaderButtons\"]/div[1]/a"),"'");
       upgradeToPro = new Link(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_PanelUpgrade\"]/a"),"");
       settings = new Link(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_PanelHeaderButtons\"]/a[1]"),"");
       logout = new Link(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]"),"");
   }

}
