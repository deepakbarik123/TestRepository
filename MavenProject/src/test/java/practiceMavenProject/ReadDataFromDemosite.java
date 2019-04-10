package practiceMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class ReadDataFromDemosite extends BaseClass {
	
	@Test
	public void testData() throws Exception {
		
		openBrowser();
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");
		
		File file=new File("C:\\Users\\USER\\Desktop\\Load data.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
		  for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) 
		   {
			String testid = sheet.getRow(i).getCell(0).getStringCellValue();
		
		 driver.findElement(By.xpath("//input[@name='txtUsername']")).clear();
		 
		 sendTextToSendBox("//input[@name='txtUsername']", testid);
		
		 String testPass = sheet.getRow(i).getCell(j).getStringCellValue();
			
		 driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
		 
		 sendTextToSendBox("//input[@id='txtPassword']", testPass);
		 
		 driver.findElement(By.xpath("//input[@name='Submit']")).click();
		 
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
		}
		
	}
	}
}
