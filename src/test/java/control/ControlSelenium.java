package control;

import driverManger.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlSelenium  {

    public WebElement myControl;
    public By myLocator;

    public ControlSelenium(By myLocator ){
         this.myLocator=myLocator;
    }

    public void Find(){
        // wait explicito
        WebDriverWait wait = new WebDriverWait(DriverHandler.getDriver().myBrowser,15);
        wait.until(ExpectedConditions.elementToBeClickable(myLocator));
        myControl=DriverHandler.getDriver().myBrowser.findElement(myLocator);
    }

    public void Click(){
        Find();
        myControl.click();
    }

    public void DoubleClick(){
        Find();
        myControl.click();
        myControl.click();
    }

    public void Set(String value){
        Find();
        myControl.sendKeys(value);
    }

    public boolean isDisplayed(){
        try {
            Find();
            return myControl.isDisplayed();
        } catch (Exception e)
        {return  false;}
    }

    public String getText(){
        Find();
        return myControl.getText();
    }

    public String getTextAttribute(String myAttribute){
        Find();
        return myControl.getAttribute(myAttribute);
    }


}
