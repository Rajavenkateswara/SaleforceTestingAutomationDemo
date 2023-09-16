package dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataprovider {
	
	
	@DataProvider(name = "loginDetails")
	public Object[][] getData() {
		Object[][] values =ExcelReader.getDataFromSheet("loginDetails");
		return values;
	}

}
