package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingMail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:gmail.com");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("deepak.cuttack@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("9778727677");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("satyajitpin290@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Demo mail");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("This is my first mail");
		driver.findElement(By.xpath("//div[@id=':po']")).click();
		
		}
	}
