package com.practice.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload  {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.pdftoword.com/en/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Select your file']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\file1.exe");
		
	}

}
