/**
 * 
 */
package practiceMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class WriteDataToExcel extends BaseClass {
	@Test
	public void writeExcelData() throws Exception {
		
		/*openBrowser();
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");*/
		
		File file=new File("C:\\Users\\USER\\Desktop\\WriteData.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		sheet.getRow(0).createCell(2).setCellValue("pass");
		
		sheet.getRow(1).createCell(2).setCellValue("fail");
		
		FileOutputStream fout = new FileOutputStream(file);
		
		wb.write(fout);	
	}
	
}
