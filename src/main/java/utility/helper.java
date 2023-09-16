package utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class helper {
	
	//Generic method for Select dropdownElements in Select using WebElement and Value as parameter
		public static void selectOptionFromDropDown(WebElement ele, String value) {

			Select drp = new Select(ele);

			List<WebElement> allOptions = drp.getOptions();

			for(WebElement option:allOptions) {
				if(option.getText().equals(value)) {
					option.click();
					break;
				}


			}
		}
	
	
	
	
	
	

}
