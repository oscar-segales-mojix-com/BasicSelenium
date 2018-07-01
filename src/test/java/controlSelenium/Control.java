package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Control {

    public WebElement myControl;
    public By mylocator;

    public Control(By mylocator){
        this.mylocator=mylocator;
    }

    public void Click(){}

    public void Set(String value){}

    public void DoubleClick(){}

}
