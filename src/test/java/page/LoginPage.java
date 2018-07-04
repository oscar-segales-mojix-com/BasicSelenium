package page;

import controlSelenium.Button;
import controlSelenium.CheckBox;
import controlSelenium.Link;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox userTextBox;
    public TextBox pwdTextBox;
    public Button loginButton;
    public CheckBox rememberCheckBox;

    public LoginPage(){
        userTextBox= new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]"));
        pwdTextBox= new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]"));
        loginButton= new Button(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]"));
        rememberCheckBox= new CheckBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_CbRemember\"]"));
    }

}
