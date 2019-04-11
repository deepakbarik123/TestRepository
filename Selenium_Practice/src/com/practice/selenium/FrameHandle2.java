package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//driver.switchTo().frame(3);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'https:')]")));
		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
		driver.switchTo().defaultContent();
		
	}

}
