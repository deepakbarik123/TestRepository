package com.TestNG.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoIbiboTestNg {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.goibibo.com/");
	}
	@Test
	public void flightBooking() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//span[text()='Round trip']")).click();
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Bangalore (BLR)']"))));
		act.moveToElement(driver.findElement(By.xpath("//input[@value='Bangalore (BLR)']"))).click();
		//driver.findElement(By.xpath("//input[@placeholder='Destination']")).sendKeys("bom");
		Thread.sleep(10000);
		act.moveToElement(driver.findElement(By.xpath("//input[@value='Mumbai (BOM)']"))).click();
		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='20']"))));
		driver.findElement(By.xpath("//div[text()='20']")).click();
		driver.findElement(By.xpath("//button[text()='SEARCH']"));
		
		
		
		
	}

}
