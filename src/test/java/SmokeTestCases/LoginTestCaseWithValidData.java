package SmokeTestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.BaseClass;
import dataProvider.ConfigReader;
import pages.SalesHomePage;
import pages.loginPage;

public class LoginTestCaseWithValidData extends BaseClass{
	
	
	
	@Test
	 public void logIn() {
		
		loginPage log = new loginPage(driver);
		
		log.loginToApplication(ConfigReader.getProperty("userName"), ConfigReader.getProperty("passWord"));
		
		assertTrue(driver.getTitle().contains("Salesforce"), "Login Test is failed");
		/*
		HomePage hm= new HomePage(driver);
		hm.searchDataInQuickFindBox("Objects");
		
		hm.newObject("Village", "Villages", "This object will store village Data");
	*/
	}

}
