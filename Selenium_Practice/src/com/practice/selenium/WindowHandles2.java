package com.practice.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("terms-link")).click();
		driver.findElement(By.id("privacy-link")).click();
		
		String parentWindow = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		for(String win : windows) {
			if(!parentWindow.equals(win)) {
				driver.switchTo().window(win);
				Thread.sleep(5000);
				/*if(driver.getTitle().equals("Data Policy")) {
					driver.close();
				}*/
				try {
				if(driver.findElement(By.xpath("//h2[text()='Data Policy']")).isDisplayed()) {
					driver.close();
				}
			}catch(Exception e) {
				System.out.println("Element is not present in this page");
			}
			}
		}
	}

}
