import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClass;
import dataProvider.CustomDataprovider;
import pages.loginPage;

public class TC001_LOGIN extends BaseClass {
	
	
	
	
	@Test(dataProvider = "loginDetails" ,dataProviderClass = CustomDataprovider.class)
	public void loginwithValidData(String username ,String password) {
		
		//System.out.println(username + " " + password );
		
		loginPage log = new loginPage(driver);
		log.loginToApplication(username, password);
		
	
	}

}
