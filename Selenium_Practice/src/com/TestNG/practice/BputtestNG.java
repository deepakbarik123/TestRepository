package com.TestNG.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BputtestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void aboutUs() {
		/*System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("http://bput.ac.in");
		Actions act=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='About Us']"))));
		act.moveToElement(driver.findElement(By.xpath("//a[text()='About Us']"))).perform();
		List<WebElement> listo=driver.findElements(By.xpath("//a[text()='About Us']/..//li"));
		for(int i=0;i<listo.size();i++) {
			System.out.println(listo.get(i).getText());
		}
	}
	@Test
	public void faceBook() {
		/*System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("http://facebook.com");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@data-testid='royal_email']"))));
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("deepak.cuttack@gmail.com");
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("dkb@2019");
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"))));
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).getText());
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'entered is incorrect. ')]")).getText());
		
	}
	
	

  }
