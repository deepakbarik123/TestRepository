/**
 * 
 */
package practiceMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
  @CodeFreak Deepak
 */
public class Practice2 {
	@Test
	public void errorMsgValidation()throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("deepak.bbsr@gmq");
		
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("rahematullah");
		
		driver.findElement(By.xpath("//input[@name='proceed']"));
	}
	

}
