package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utility.helper;

public class Campaigns {
	
	WebDriver driver ;
	
	public Campaigns(WebDriver driver) {
		
		this.driver = driver;
		}
	
	
	By CampaignName =  By.xpath("//input[@id = 'cpn1']");
	By Type = By.xpath("//select[@id = 'cpn2']");
	By status = By.xpath("//select[@id = 'cpn3']");
	By startDate = By.xpath("//input[@id = 'cpn5']");
	By Month = By.xpath("//select[@id = 'calMonthPicker']");
	By EndDate = By.xpath("//input[@id = 'cpn6']");
	By year = By.xpath("//select[@id = 'calYearPicker']");
	
	By dates = By.xpath("//table[@id = 'datePickerCalendar']//td");
	
	By Actual_Cost_in_Campaign = By.id("cpn10");
	
	By save = By.xpath("//input[@name = 'save']");
    public void compaignInformation(String campaing ,String actualCost ) {
    	driver.findElement(this.CampaignName).sendKeys(campaing);
    	helper.selectOptionFromDropDown(driver.findElement(Type), "Email");
    	helper.selectOptionFromDropDown(driver.findElement(status), "In Progress");
    	
    	driver.findElement(startDate).click(); // dispalying Calender
    	
    	Select month = new Select(driver.findElement(Month));
    	month.selectByVisibleText("December");
    	
    	WebElement y =driver.findElement(year);
    	
    	Select selectYear = new Select(y); 
    	selectYear.selectByVisibleText("2024");
    	
    	String date = "21";
    	
    	List<WebElement> listdate =driver.findElements(dates);
    	
    	for(WebElement ele:listdate) {
    		
    		//System.out.println(ele.getText());
    		
    		if(ele.getText().equals(date)) {
    			ele.click();
    			break;
    		}
    	}
    	
    	
    	driver.findElement(EndDate).click(); // Click on endDate calender
    	
    	Select emonth = new Select(driver.findElement(Month));
    	emonth.selectByVisibleText("November");
    	
    	WebElement ey =driver.findElement(year);
    	
    	Select eselectYear = new Select(ey); 
    	eselectYear.selectByVisibleText("2025");
    	
    	
	String edate = "29";
    	
    	List<WebElement> elistdate =driver.findElements(dates);
    	
    	for(WebElement ele:elistdate) {
    		
    		//System.out.println(ele.getText());
    		
    		if(ele.getText().equals(edate)) {
    			ele.click();
    			break;
    		}
    	
    	 }
    	
    	driver.findElement(Actual_Cost_in_Campaign).sendKeys(actualCost);
    	
    	driver.findElement(save).click();
    	
}
}
