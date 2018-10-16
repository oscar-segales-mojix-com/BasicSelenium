package pages;

import control.Button;
import control.Icon;
import control.Link;
import control.TextBox;
import org.openqa.selenium.By;

public class LeftMenuPage {

    public Button addNewProjectButton;
    public Button addButton;
    public TextBox nameProjectText;
    public Icon menuIcon;
    public Button deleteButton;


    public LeftMenuPage(){
        addNewProjectButton= new Button(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]"),
                "[add New Project] Button in LeftMenu Page");
        addButton= new Button(By.id("NewProjNameButton"),"[add] Button in LeftMenu Page");
        nameProjectText= new TextBox(By.id("NewProjNameInput"),"[nameProject] TextBox in LeftMenu Page");
        menuIcon = new Icon(By.xpath("//*/table/tbody/tr/td[4]/div[2]/img"),"");
        deleteButton = new Button(By.xpath("//*[@id=\"ProjShareMenuDel\"]"),"");
    }

     public void selectProject(String nameProj){

          String locator ="//li/div/table/tbody/tr/td[contains(.,\""+nameProj+"\")]";
          Link nameProjectLink = new Link(By.xpath(locator),"'");
          nameProjectLink.click();
     }

     public boolean isDisplayedProj(String nameProj){
         String locator ="//li/div/table/tbody/tr/td[contains(.,\""+nameProj+"\")]";
         Link nameProjectLink = new Link(By.xpath(locator),"'");
         return nameProjectLink.isDisplayed();
     }

}
