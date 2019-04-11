package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	static WebDriver driver;
	
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		 driver=new ChromeDriver();
	}

	public static void main(String[] args) throws InterruptedException {
		openBrowser();
		driver.get("http://flipkart.com");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href,'Electronics')][text()='Mi']")).click();
		openBrowser();
		
		//f1.findElement(By.xpath("//span[text()='Electronics']")).click();
	}
}
