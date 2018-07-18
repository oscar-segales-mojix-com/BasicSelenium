package page;

import controlSelenium.Button;
import controlSelenium.Link;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class MenuLeftBarPage {

   public Link addNewProjectLink;
   public TextBox nameProjectTextBox;
   public Button addButton;
   private Link projectNameLink;

   public MenuLeftBarPage()
   {
       addNewProjectLink = new Link(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]")," [add new project] Link in Menu Left Bar Page");
       nameProjectTextBox = new TextBox(By.xpath("//*[@id=\"NewProjNameInput\"]")," [name project] TextBox in Menu Left Bar Page");
       addButton = new Button(By.xpath("//*[@id=\"NewProjNameButton\"]")," [add] Button in Menu Left Bar Page");
   }

  public boolean existProjectInTheList(String name){
       projectNameLink= new Link(By.xpath("//table[@class='ProjItemTable']/tbody/tr/td[contains(.,'"+name+"')]")," [Project Name] Link Link in Menu Left Bar Page");
       return projectNameLink.isDisplayed();
  }

}
