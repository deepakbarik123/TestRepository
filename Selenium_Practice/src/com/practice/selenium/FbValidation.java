package com.practice.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FbValidation {
	static WebDriver driver;
	
	/*public static WebElement getWebElementByXpath(String path) {
		return driver.findElement(By.xpath(path));
	}
	
	public static WebElement getWebElementByName(String name) {
		return driver.findElement(By.name(name));
	}
	
	public static void sendDataToTextBox(String path, String text) {
		getWebElementByXpath(path).sendKeys(text);
	}*/
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:flipkart.com");
		//getWebElementByXpath("//input[@class='_2zrpKA']").sendKeys("");
		//sendDataToTextBox("//input[@class='_2zrpKA']", "deepak.cuttack@gmail.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("deepak.cuttack@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9778727677");
		driver.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Electronics']"))));
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'Electronics')][text()='Samsung']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(.,'Samsung mobiles')]/..//span")));
		driver.findElement(By.xpath("//h2[contains(.,'Samsung mobiles')]/..//span")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Samsung Galaxy A7 (Black, 128 GB)']")));
		driver.findElement(By.xpath("//img[@alt='Samsung Galaxy A7 (Black, 128 GB)']")).click();
		String parentwin=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for(String win:windows) {
			if(!(parentwin.equals(win))) {
				driver.switchTo().window(win);
		}
		}
		driver.findElement(By.xpath("//div[contains(@data-img,'imaf9d35cv5anzqw.jpeg')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='ADD TO CART']")));
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.switchTo().window(parentwin);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		
		
		
		
		
		
	}

}
