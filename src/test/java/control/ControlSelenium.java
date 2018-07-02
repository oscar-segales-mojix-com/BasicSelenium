package control;

import driverManger.DriverHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlSelenium  {

    public WebElement myControl;
    private By myLocator;

    public ControlSelenium(By myLocator ){
         this.myLocator=myLocator;
    }

    public void Find(){
        WebDriverWait wait = new WebDriverWait(DriverHandler.getDriver().myBrowser(),30);
        wait.until(ExpectedConditions.elementToBeClickable(this.myLocator));
        myControl= DriverHandler.getDriver().myBrowser().findElement(myLocator);
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
        Find();
        return myControl.isDisplayed();
    }


}
