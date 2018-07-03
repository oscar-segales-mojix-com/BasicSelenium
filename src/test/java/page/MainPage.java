package page;

import control.LinkText;
import org.openqa.selenium.By;

public class MainPage {

    public LinkText login;

    public MainPage(){
        login = new LinkText(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img"));
    }
}
