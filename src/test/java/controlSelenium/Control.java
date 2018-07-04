package controlSelenium;

import driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Control {

    public WebElement myControl;
    public By mylocator;

    public void Find(){
       myControl=DriverManager.getInstance().mydriver.findElement(mylocator);
    }

    public Control(By mylocator){
        this.mylocator=mylocator;
    }

    public void click(){
        Find();
        myControl.click();
    }

    public void set(String value){
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




















}
