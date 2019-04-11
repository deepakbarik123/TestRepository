package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:tatacliq.com");
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Brands']"))).perform();
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		driver.findElement(By.xpath("//div[text()='Motorola']")).click();
	}

}
