package com.mavenDemo.MavenProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fileUploadAutoit {
	WebDriver driver;
	
	public WebElement getElement(String path) {
		return driver.findElement(By.xpath(path));
	}
	
	public void sendTextToTextBox(String path, String text) {
		getElement(path).sendKeys(text);
	}
	
	@Parameters({"browserNameIdentification"})
	@BeforeMethod
	public void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\USER\\Downloads\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	
	//@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		}
	@Test
	public void fileupload() throws IOException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Select PDF file']"))));
		//driver.findElement(By.xpath("//a[text()='Select PDF file']")).click();
		/*getElement("//a[text()='Select PDF file']").click();
		Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\file27.exe");
		Thread.sleep(5000);*/
	}
	
	@Test
	public void test1() {
		//openBrowser1();
		System.out.println("2nd test");
	}
	/*@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}*/
	

}
