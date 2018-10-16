package pages;

import control.Label;
import org.openqa.selenium.By;

public class ProjectFormPage {

    public Label nameProjectLabel;

    public ProjectFormPage(){
        nameProjectLabel = new Label(By.xpath("//*[@id=\"CurrentProjectTitle\"]"),"");
    }
}
