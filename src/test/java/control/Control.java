package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class Control {

    private By locator;
    private WebElement myControl;

    public Control(By locator){
        this.locator= locator;
    }
    public WebElement getMyControl(){
        return myControl;
    }

    public By getLocator(){
        return  locator;
    }

    public void Find(){
        myControl=browserManager.browserManager.getInstance().getSession().findElement(this.locator);
    }

    public void click(){
        this.Find();
        myControl.click();
    };

    public void type(String value){
        this.Find();
        myControl.sendKeys(value);
    };

    public boolean isDisplayed(){
        return true;
    }
}
