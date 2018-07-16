package controlSelenium;

import driverManager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Control {

    public WebElement myControl;
    public By mylocator;
    private String myName;

    public void Find(){
       myControl=DriverManager.getInstance().mydriver.findElement(mylocator);
    }

    public Control(By mylocator, String myName){
        this.mylocator=mylocator; this.myName=myName;
    }

    public void click(){
        stepLogger("Click on "+myName);
        Find();
        myControl.click();
    }

    public void set(String value){
        stepLogger("Set value '"+value+"' on "+myName);
        Find();
        myControl.sendKeys(value);
    }

    public void doubleClick(){
        Find();
        myControl.click();
        myControl.click();
    }

    public String getTextValue(){
        Find();
        return myControl.getText();
    }

    public String getTextAttributeValue(String attribute){
        Find();
        return myControl.getAttribute(attribute);
    }

    public boolean isDisplayed(){
        try {
            Find();
            return myControl.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    @Step("{0}")
    public void stepLogger(String accion){}

}
