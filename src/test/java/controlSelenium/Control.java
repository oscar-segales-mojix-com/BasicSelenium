package controlSelenium;

import driverManager.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Control {

    public WebElement myControl;
    public By mylocator;
    private String myName;

    public void Find(){
        // explicit -wait -> specific control

       WebDriverWait wait = new WebDriverWait(DriverManager.getInstance().mydriver,15);
       wait.until(ExpectedConditions.elementToBeClickable(mylocator));

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




    public void DragAndDrop( By locatorControl){
        Actions customAction = new Actions(DriverManager.getInstance().mydriver);
        Find();
        customAction.dragAndDrop(myControl,
                DriverManager.getInstance().mydriver.findElement(locatorControl));
    }





















}
