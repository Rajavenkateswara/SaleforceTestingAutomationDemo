package CampaingTestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import FrameWorkDesign.HomePage;
import dataProvider.ConfigReader;
import pages.Campaigns;
import pages.SalesHomePage;
import pages.loginPage;

public class CreateCampaingRecordWithValidData extends BaseClass {
	
	
	@Test
	public void createCampaingRecord() {
		
		loginPage login = new loginPage(driver);
		
		login.loginToApplication(ConfigReader.getProperty("userName"), ConfigReader.getProperty("passWord"));
	
	    SalesHomePage hm  = new SalesHomePage(driver);
	    hm.ClickOnCampaings();
	    hm.closePromt();
	    
	    Campaigns create = new Campaigns(driver);
	    create.compaignInformation("Technical" , "1200");
	   
	    
	   // hm.signOut();
		
	}
	
	

}
