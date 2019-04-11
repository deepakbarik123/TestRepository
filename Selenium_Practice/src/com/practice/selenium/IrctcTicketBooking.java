package com.practice.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcTicketBooking {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("BNC");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'CANT - BNC')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("BBS");
		driver.findElement(By.xpath("//span[text()='BHUBANESWAR - BBS']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).click();
		driver.findElement(By.xpath("//span[@class='fa fa-angle-right']")).click();
		driver.findElement(By.xpath("//a[text()='14']")).click();
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		/*Select sel=new Select(driver.findElement(By.xpath("//span[contains(@class,'ui-dropdown-trigger-icon')]")));
		sel.selectByValue("Sleeper (SL)");*/
		//driver.findElement(By.xpath("//span[text()='GUWAHATI EXP']/../../../../..//select")).isDisplayed();
		/*new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']")));
		Select sel1=new Select(driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']")));
		sel1.selectByVisibleText("AC 3 Tier (3A)");*/
		driver.findElement(By.xpath("//button[contains(@aria-label,'rain Number 12509 from BENGALURU CANT')]")).click();
		driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
		driver.findElement(By.xpath("//span[contains(.,'14 Mar 2019')]/../..//a")).click();
		
		
		
		
	}

}
