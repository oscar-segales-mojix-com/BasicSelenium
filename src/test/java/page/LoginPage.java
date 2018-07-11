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
        userTextBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]")," [user]field on login page ");
        pwdTextBox = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]"),"[password] field on login page");
        loginButton = new Button(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]")," [login] button on login page");
        rememberCheckBox = new Checkbox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_CbRemember\"]")," [remember] checkbox on login page" );
    }

}


