package com.practice.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("terms-link")).click();
		
		String parentWin = driver.getWindowHandle();
		
		Set<String> windows = driver.getWindowHandles();
		for(String win : windows) {
			if(!(parentWin.equals(win))) {
				driver.switchTo().window(win);
			}
		}
		
		Iterator<String> it = windows.iterator();
		/*String parentWindow = it.next();
		String childWindow = it.next();*/
		/*while(it.hasNext()) {
			if(!(parentWin.equals(it.next()))) {
				driver.switchTo().window(it.next());
			}
		}*/
		//driver.switchTo().window(childWindow);
		driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		//driver.switchTo().window(parentWin);
		
		//driver.switchTo().window(parentWindow);
		//driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        String NewParentWin = driver.getWindowHandle();
		
		Set<String> NewWindows = driver.getWindowHandles();
		for(String win : NewWindows) {
			if(!(NewParentWin.equals(win))) {
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		driver.switchTo().window(parentWin);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
	}

}
