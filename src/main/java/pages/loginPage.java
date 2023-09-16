package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	By userName = By.id("username");
	By passWord = By.id("password");
	By sinIn = By.xpath("//input[@id = 'Login']");
	
	public void loginToApplication(String userName, String passWord) {
		driver.findElement(this.userName).sendKeys(userName);
		driver.findElement(this.passWord).sendKeys(passWord);
		driver.findElement(sinIn).click();
	}

}
