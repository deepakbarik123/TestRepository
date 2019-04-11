package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleOpen {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("chilika");
		
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
			
	}

}
