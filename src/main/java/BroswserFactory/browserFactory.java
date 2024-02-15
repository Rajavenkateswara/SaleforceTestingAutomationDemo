package BroswserFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class browserFactory {
	
	
	
public static WebDriver setUpBrowser(String browser , String url) {
		
		WebDriver driver = null;
		
		if(browser.equals("Chrome") || browser.contains("GC") || browser.contains("GoogleChrome")){
			
			driver = new ChromeDriver();
		}else if(browser.equals("firefox") || browser.equals("FF")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("Edge") || browser.equals("EdgeBrowser")) {
			driver = new EdgeDriver();
		}else if(browser.equals("Safari") || browser.equals("SafariBrowser")) {
			driver= new SafariDriver();
		}
		else {
			System.out.println("default browser Chrome "  );
			
			driver = new ChromeDriver();
		}
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		return driver;
	}

}
