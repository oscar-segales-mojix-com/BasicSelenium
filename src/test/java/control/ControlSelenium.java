package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ControlSelenium  {

    public WebElement myControl;
    public By myLocator;

    public ControlSelenium(By myLocator ){
         this.myLocator=myLocator;
    }

    public WebElement Find(){return null;}

    public void Click(){}

    public void DoubleClick(){}

    public void Set(String value){}

    public boolean isDisplayed(){ return true;}


}
