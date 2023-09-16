package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesHomePage {
	
	public WebDriver driver ;
	
	
	public SalesHomePage(WebDriver driver){
		this.driver = driver;
	}
	
 By close = By.id("tryLexDialogX");

 By search =  By.xpath("//input[@id = 'setupSearch']");
 By objects = By.xpath("//a[text() = 'Objects']");
 By NewCustomObject = By.xpath("//input[@title = 'New Custom Object']");
 
 By label = By.id("MasterLabel");
 By puralLabel = By.id("PluralLabel");
 By descri  = By.id("Description");
 By allowSearch  =By.id("options_20");
 
 By saveAndNew = By.xpath("//input[@value = 'Save & New']");
 
 By campaings = By.xpath("//a[text() = 'Campaigns']");
 
 By newButton = By.xpath("//input[@value = ' New ']");
 
 By user = By .xpath("//div[@id = 'userNav-arrow']");
 
 By logout = By.xpath("//a[text() = 'Logout']");
 
 public void ClickOnCampaings() {
	 driver.findElement(campaings).click();
	 driver.findElement(newButton).click();
 }
 
 
 public void searchDataInQuickFindBox(String searchvalue) {
	 
	 driver.findElement(search).sendKeys(searchvalue);
	 driver.findElement(objects).click();
	 driver.findElement(NewCustomObject).click();
	 
 }
 public void newObject(String label ,String puralLabel,String descri ) {
	 
	 driver.findElement(this.label).sendKeys(label);
	 driver.findElement(this.puralLabel).sendKeys(puralLabel);
	 driver.findElement(this.descri).sendKeys(descri);
	 driver.findElement(allowSearch).click();
	 driver.findElement(saveAndNew).click();
	 
	 
 }
 
 public void closePromt() {
	 driver.findElement(close).click();
 }
 
 public void signOut() {
	 driver.findElement(user).click();
	 driver.findElement(logout).click();
 }
	

}
