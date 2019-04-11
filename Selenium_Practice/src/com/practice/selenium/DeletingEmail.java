package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletingEmail {

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
		//driver.findElement(By.xpath("//span[@id=':5c']")).click();
		//driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA T-I-Zf-aw2']")).click();
		driver.findElement(By.xpath("//div[@class='oZ-jc T-Jo J-J5-Ji']")).click();
		driver.findElement(By.xpath("//span[@class='asa bjy']")).click();
		driver.findElement(By.xpath("//div[@id=':qc']")).click();
	}

}
