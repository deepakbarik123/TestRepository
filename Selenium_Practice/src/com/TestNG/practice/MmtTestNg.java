package com.TestNG.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MmtTestNg {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.makemytrip.com");
	}
	@Test
	public void flightbooking() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).clear();
		driver.findElement(By.xpath("//label[text()='round trip']")).click();
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).sendKeys("blr");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Bangalore, India']"))));
		driver.findElement(By.xpath("//span[text()='Bangalore, India']")).click();
		driver.findElement(By.xpath("//input[@id=\"hp-widget__sTo\"]")).sendKeys("bom");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Mumbai, India']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("webpush-bubble");
		driver.findElement(By.xpath("//button[contains(.,'do this later')]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@mt-id='departDate']")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(@class,'dateFilterReturn hasDatepicker')]//span[text()='March']/ancestor::div/following-sibling::table//a[text()='20']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@title='Jet Airways 9W-410']"))));
		driver.findElement(By.xpath("//span[@title='Jet Airways 9W-410']")).click();
		driver.findElement(By.xpath("//span[@title='Go Air G8-517']")).click();
		driver.findElement(By.xpath("//a[text()='Book']")).click(); 
		
	}
	

}
