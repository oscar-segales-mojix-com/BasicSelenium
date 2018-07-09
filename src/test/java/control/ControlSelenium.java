package control;

import driverManger.DriverHandler;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControlSelenium  {

    public WebElement myControl;
    private By myLocator;
    private String myName;

    public ControlSelenium(By myLocator,String myName){
         this.myLocator=myLocator;
         this.myName=myName;
    }

    public void Find(){
        WebDriverWait wait = new WebDriverWait(DriverHandler.getDriver().myBrowser(),30);
        wait.until(ExpectedConditions.elementToBeClickable(this.myLocator));
        myControl= DriverHandler.getDriver().myBrowser().findElement(myLocator);
    }


    public void Click(){
        stepLogger("Click "+myName);
       Find();

       myControl.click();
    }


    public void DoubleClick(){
        Find();
        myControl.click();
        myControl.click();
    }

    public void Set(String value){
        stepLogger("Set value '"+value+"' on "+myName);
        Find();
        myControl.sendKeys(value);
    }

    public boolean isDisplayed(){
        Find();
        stepLogger("Check if control "+myName+" is displayed ?");
        return myControl.isDisplayed();
    }

    @Step("{0}")
    public void stepLogger(String accion){}
}
