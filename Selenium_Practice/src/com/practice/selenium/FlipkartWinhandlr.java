package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWinhandlr {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http:flipkart.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement textbox1=driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		textbox1.sendKeys("Samsung galaxy a7");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
	}

}
