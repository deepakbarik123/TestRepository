/**
 * 
 */
package practiceMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class ReadDataFromExcel extends BaseClass {
	
	public String readDataFromExcel(String filePath, String sheetName, int row, int cell) throws Exception {
		
       File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		String cellValue = sheet.getRow(row).getCell(cell).getStringCellValue();
		
		return cellValue;
		
	}
	
	public String readParticularDataFromExcel(String filePath, String sheetName, String expectedData) throws Exception {
		
		   String cellValue = " ";
	       File file = new File(filePath);
			
			FileInputStream fis = new FileInputStream(file);
			
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workBook.getSheet(sheetName);
			
			for(int i = 0; i <= sheet.getLastRowNum(); i++) {
				for(int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
					cellValue = sheet.getRow(i).getCell(j).getStringCellValue().toString();
					if(expectedData.equals(cellValue)) {
						break;
					}
				}
			}
			return cellValue;
			}
	 @Test
	public void readData() throws Exception {
		openBrowser();
		driver.get("https://gmail.com");
		
		
		sendTextToSendBox("//input[@id='identifierId']", 
		readParticularDataFromExcel("C:\\Users\\USER\\Desktop\\GmailData.xlsx", "Sheet1", "123"));
				
		/*Thread.sleep(5000);
		sendTextToSendBox("//input[@id='password']", password);*/
		
	}

}
