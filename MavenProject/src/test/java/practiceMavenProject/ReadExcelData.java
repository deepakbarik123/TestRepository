/**
 * 
 */
package practiceMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
  @CodeFreak Deepak
 */
public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		File file=new File("C:\\Users\\USER\\Desktop\\Load data.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);{
		for(int i=0;i<sheet.getLastRowNum();i++) {
			
			for(int j=0;j<sheet.getRow(i).getLastCellNum();j++) {
			
		String data = sheet.getRow(i).getCell(j).getStringCellValue();
			
		System.out.println(data);
			}
		}
	  }
	}

}
