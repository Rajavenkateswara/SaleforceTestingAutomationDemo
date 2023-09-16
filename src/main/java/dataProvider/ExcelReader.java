package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	static XSSFWorkbook workBook;


	public static Object[][] getDataFromSheet(String sheetName) {
		//sheetName = "loginDetails";
		Object[][]array = null;
		try {
			workBook = new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/testData/TestData.xlsx")));
			//Get Sheet from table 
			XSSFSheet sheet = workBook.getSheet(sheetName);
			
			//No_of records from table i..e rows.
			int rows = sheet.getPhysicalNumberOfRows();
			
			//Get number of column from table (Fields from table 
			int column = sheet.getRow(0).getPhysicalNumberOfCells();
           
			array = new Object[rows-1][column];
			
			for(int i = 1 ; i< rows ;i++) {
				for(int j = 0; j< column ; j++) {
					
					// array[i][j] = workBook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
					array[i-1][j] = getData(sheetName, i, j);
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}
	public static String getData(String sheetName ,int i , int j ) {
		
		XSSFCell cell =workBook.getSheet(sheetName).getRow(i).getCell(j);
		
		String data = "";
		if(cell.getCellType() == CellType.STRING) {
			
			data =cell.getStringCellValue();
		}else if( cell.getCellType() == CellType.NUMERIC) {
			 
			double value = cell.getNumericCellValue();
			data =String.valueOf(value);
		}else if(cell.getCellType() == CellType.BOOLEAN) {
			
			boolean status =cell.getBooleanCellValue();
		data = String .valueOf(status);
		}else if ( cell.getCellType() == CellType.BLANK) {
			data = "";
		}
		return data;
	}
	
	
	

}
