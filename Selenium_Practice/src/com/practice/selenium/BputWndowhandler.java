package com.practice.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BputWndowhandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:bput.ac.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Result']")).click();
		String parentwin=driver.getWindowHandle();
		Set<String> win=driver.getWindowHandles();
		for(String childwin:win) {
			if(!(parentwin.equals(childwin))) {
				driver.switchTo().window(childwin);
			}
		}
		WebElement textbox=driver.findElement(By.xpath("//input[@name='txtRegNo']"));
		textbox.sendKeys("0901215227");
		String child=driver.getWindowHandle();
		driver.switchTo().window(parentwin);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.switchTo().window(child).close();
		
	}

}
