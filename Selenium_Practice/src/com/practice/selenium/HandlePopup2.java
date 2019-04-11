package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/javascript/javascript_dialog_boxes.htm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/javascript/src/confirmation_dialog_box.htm']")));
		
		driver.findElement(By.xpath("//input[@onclick='getConfirmation();']")).click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		driver.switchTo().defaultContent();
		
	}

}
