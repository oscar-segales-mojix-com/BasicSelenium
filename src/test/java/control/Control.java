package control;

import Logger.MyLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Control {

    private By locator;
    private WebElement myControl;
    private String myInfo;

    public Control(By locator, String myInfo){
        this.locator= locator;
        this.myInfo=myInfo;
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
       // wait.until(ExpectedConditions.elementToBeClickable(this.locator)); //  Explicit wait

        myControl=browserManager.browserManager.getInstance().getSession().findElement(this.locator);
    }

    public void click(){
        this.Find();
        MyLogger.getInstance().write("Click "+this.myInfo,"INFO");
        myControl.click();
    };

    public void type(String value){
        this.Find();
        MyLogger.getInstance().write("Type this value "+value +"on "+this.myInfo,"INFO");
        myControl.sendKeys(value);
    };

    public void dobleClick(){
        Actions actions= new Actions(browserManager.browserManager.getInstance().getSession());
        actions.doubleClick();

    }



    public boolean isDisplayed(){
        try {
            this.Find();
            MyLogger.getInstance().write("is Displayed :"+myControl.isDisplayed()+" "+this.myInfo,"INFO");
            return myControl.isDisplayed();
        } catch (Exception e)
        {
            MyLogger.getInstance().write("is Displayed :"+false+" "+this.myInfo,"INFO");
          return  false;
        }
    }

    public String getValue(){
        this.Find();
        MyLogger.getInstance().write("Get Value "+this.myInfo+" the value is : "+myControl.getText(),"INFO");
        return myControl.getText();
    }



}
