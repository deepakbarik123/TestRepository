package com.practice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("59320");
		driver.findElement(By.name("submit")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		//alt.dismiss();
		
		alt.accept();
		System.out.println(alt.getText());
		
	}

}
