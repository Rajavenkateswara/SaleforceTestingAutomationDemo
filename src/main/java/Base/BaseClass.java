package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import BroswserFactory.browserFactory;
import dataProvider.ConfigReader;

public class BaseClass {
	
	
	public WebDriver driver ;
	@BeforeClass
	public void setUpBrowser() {
		driver =browserFactory.setUpBrowser(ConfigReader.getProperty("browser"), ConfigReader.getProperty("url"));
	}

}
