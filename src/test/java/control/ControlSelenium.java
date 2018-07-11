package control;

import driverManger.DriverHandler;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ControlSelenium  {

    public WebElement myControl;
    public By myLocator;
    private String myName;

    public ControlSelenium(By myLocator , String myName){
         this.myLocator=myLocator;
         this.myName=myName;
    }

    @Step("{0}")
    public void stepLogger(String accion){

    }

    public void Find(){
        // wait explicito
        WebDriverWait wait = new WebDriverWait(DriverHandler.getDriver().myBrowser,15);
        wait.until(ExpectedConditions.elementToBeClickable(myLocator));
        myControl=DriverHandler.getDriver().myBrowser.findElement(myLocator);
    }

    public void Click(){
        Find();
        stepLogger("Click on "+myName);
        myControl.click();
    }

    public void DoubleClick(){
        Find();
        stepLogger("Double Click on "+myName);
        myControl.click();
        myControl.click();
    }

    public void Set(String value){
        Find();
        stepLogger("Set value '"+value+"' on "+myName);
        myControl.sendKeys(value);
    }

    public boolean isDisplayed(){
        try {
            stepLogger("Check if control "+myName+" is displayed");

            Find();
            return myControl.isDisplayed();
        } catch (Exception e)
        {return  false;}
    }

    public String getText(){
        stepLogger("Get text of "+myName);
        Find();
        return myControl.getText();
    }

    public String getTextAttribute(String myAttribute){
        Find();
        return myControl.getAttribute(myAttribute);
    }

    public void dragAndDrop(WebElement target){
        Find();
        Actions actions = new Actions(DriverHandler.getDriver().myBrowser);
        actions.dragAndDrop(myControl,target);
    }
}
