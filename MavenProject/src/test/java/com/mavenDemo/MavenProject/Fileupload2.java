package com.mavenDemo.MavenProject;

import java.io.IOException;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload2 extends BaseClass {
	//WebDriver driver;
	@Test
	public void fileupload() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://pdf2doc.com/");
		driver.findElement(By.xpath("//span[text()='Upload Files']")).click();
		Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\file34.exe");
	}

}
