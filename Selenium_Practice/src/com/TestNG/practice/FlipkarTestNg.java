package com.TestNG.practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkarTestNg {
	WebDriver driver;
	
	@BeforeMethod
		public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://flipkart.com");
		}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='TVs & Appliances']"))));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='TVs & Appliances']"))).perform();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@title='Smart & Ultra HD']"))));
		driver.findElement(By.xpath("//a[@title='Smart & Ultra HD']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']"))));
		driver.findElement(By.xpath("//div[text()='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']")).click();
		String item1=driver.findElement(By.xpath("//div[text()='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']")).getText();

		/*wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']"))));
		driver.findElement(By.xpath("//img[@alt='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']"))));
		driver.findElement(By.xpath("//img[@alt='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']")).click();
		String item1=driver.findElement(By.xpath("//div[text()='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']")).getText();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Thomson']"))));
		driver.findElement(By.xpath("//a[text()='Thomson']")).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='Thomson UD9 140cm (55 inch) Ultra HD (4K) LED Smart TV']"))));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Thomson UD9 140cm (55 inch) Ultra HD (4K) LED Smart TV']")).click();*/
		
		String parentwin=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for(String win:windows) {
			if(!(parentwin.equals(win))) {
				driver.switchTo().window(win);
			}
		}
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='ADD TO CART']"))));
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		//String item2=driver.findElement(By.xpath("//img[contains(@src,'imafb3ahypvgyjgw.jpeg')]")).getText();
		Thread.sleep(5000);
		String item2=driver.findElement(By.xpath("//a[text()='LG Smart 108cm (43 inch) Ultra HD (4K) LED Smart TV 2018 Edition']")).getText();

		if(item1.equals(item2)) {
			driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		}
		else {
			driver.quit();
			}
		}
	}
