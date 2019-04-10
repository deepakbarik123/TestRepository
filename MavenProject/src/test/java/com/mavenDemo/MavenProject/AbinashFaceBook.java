package com.mavenDemo.MavenProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class AbinashFaceBook extends FacebookLoginPage
{
	//WebDriver driver;
	public void login() throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();*/
		
		openBrowser();
		driver.get("https://www.facebook.com/");
		//validateLoginPage();
		//validateSignUpFieldLinks();
		validElements();
		
		//List<WebElement> element=driver.findElements(By.xpath("//div[@role='contentinfo']//a"));
		/*List<WebElement> element=driver.findElements(By.xpath("//div[@class='_58mu']//a"));
		for(int i=0;i<element.size();i++)
		{
			//element = driver.findElements(By.xpath("//div[@role='contentinfo']//a"));
			element.get(i).click();
			Thread.sleep(2000);
			handleWindow();
			//driver.navigate().back();
		}*/
		
	}
	
}
