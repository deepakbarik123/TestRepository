package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailopen {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver t2=new ChromeDriver();
		t2.get("http://rediffmail.com");
		
		t2.get("http://bput.ac.in");
		
		t2.get("http://filmyzilla.in");
	}

}
