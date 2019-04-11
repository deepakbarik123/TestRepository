package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyshowbooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("https://in.bookmyshow.com/bengaluru");
	
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='wzrk-cancel']")));
	driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
	WebDriverWait wait1=new WebDriverWait(driver,10);
	
	wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/movies']")));
    driver.findElement(By.xpath("//a[@href='/movies']")).click();
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@data-src,'kgf-et00042769-04-10-2016-03-44-43.jpg')]")));
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@data-src,'kgf-et00042769-04-10-2016-03-44-43.jpg')]")));
    
	driver.findElement(By.xpath("//img[contains(@data-src,'kgf-et00042769-04-10-2016-03-44-43.jpg')]")).click();
	driver.findElement(By.xpath("//a[text()='Book Tickets']")).click();
	driver.findElement(By.xpath("//a[text()='Gopalan Cinemas: Arcade Mall, Mysore Road']")).click();
	driver.findElement(By.xpath("//a[contains(.,'03:45 PM')]")).click();
	/*Alert alt=driver.switchTo().alert();
	System.out.println(alt.getText());*/
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Terms & Conditions']")));
	System.out.println(driver.findElement(By.xpath("//span[text()='Terms & Conditions']")).getText());
	
	}

}
