package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(browserManager.browserManager.getInstance().getSession(),
                10);
        wait.until(ExpectedConditions.elementToBeClickable(this.locator)); //  Explicit wait

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
