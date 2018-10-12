package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button loginButton;

    public MainPage(){
        loginButton = new Button(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img"));
    }
}
