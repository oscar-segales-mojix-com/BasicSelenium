package page;

import control.Button;
import control.Checkbox;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {

    public TextBox userTextBox;
    public TextBox pwdTextBox;
    public Button loginButton;
    public Checkbox rememberCheckBox;

    public LoginPage(){
        userTextBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]"));
        pwdTextBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]"));
        loginButton = new Button(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]"));
        rememberCheckBox = new Checkbox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_CbRemember\"]"));
    }

}


