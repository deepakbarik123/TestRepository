package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubeopen {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
       WebDriver t1=new ChromeDriver();
       
       t1.get("http://google.com");
       
       t1.findElement(By.xpath("//a[@class='gb_b gb_rc']")).click();
       
       Thread.sleep(8000);
       
       
      t1.findElement(By.xpath("//span[text()='YouTube']")).click();
	}

}
