/**
 * 
 */
package practiceMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
  @CodeFreak Deepak
 */
public class PracticOrangeHrm {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://orangehrm-demo-6x.orangehrmlive.com/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).clear();
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		
		
	}
}
