package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bookmyshow {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver book1=new ChromeDriver();
		
		book1.get("http://in.bookmyshow.com");
		
		//Thread.sleep(1000);
		
		//book1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(book1, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@onclick,\\\"('BANG','Bengaluru');\\\")]")));
		
		book1.findElement(By.xpath("//a[contains(@onclick,\"('BANG','Bengaluru');\")]")).click();
	}

}
