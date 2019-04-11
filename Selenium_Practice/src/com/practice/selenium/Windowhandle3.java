package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandle3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		/*driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='COURSES']"))).perform();
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.xpath(""))).perform();
		/*WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Guru99 Demo Sites']")));*/
		
		driver.switchTo().frame("_mN_main_224278574_0_n");
		WebElement frameElement = driver.findElement(By.xpath("//script[@id='mNCC']/following-sibling::iframe"));
		driver.switchTo().frame(frameElement);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[text()='Data Science Courses']")).click();
		
		driver.switchTo().defaultContent();
		
	}

}
