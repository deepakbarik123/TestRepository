package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:flipkart.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Sports, Books & More']"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Yoga Mats']")).click();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='TVs & Appliances']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Official Android TVs']")).click();
	}
	

}
