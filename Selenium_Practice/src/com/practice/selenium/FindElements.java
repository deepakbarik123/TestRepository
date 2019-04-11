package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='gb_P']"));
		//System.out.println(findElement.getText());
		
		List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='gb_P']"));
		for(int i = findElements.size()-1; i >=0; i--) {
			System.out.println(findElements.get(i).getText());
		}
	}

}
