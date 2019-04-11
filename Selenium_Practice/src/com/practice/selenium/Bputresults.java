package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bputresults {

	public static void main(String[] args)throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver bp77=new ChromeDriver();
		bp77.get("http://bput.ac.in");
		
		Thread.sleep(1000);
		
		bp77.findElement(By.xpath("//a[text()='Result']")).click();
		//Select sel1=new Select(bp77.findElement(By.id("//select[@id='ddlSession']")));
		//sel1.selectByVisibleText("Odd-2013");
	}

}
