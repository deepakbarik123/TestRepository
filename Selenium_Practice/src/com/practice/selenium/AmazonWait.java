package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonWait {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://amazon.in");
		System.out.println(driver1.findElement(By.id("a-autoid-0-announce")).getText());
		//Thread.sleep(2000);
	/*	driver1.findElement(By.xpath("//span[text()=\"Hello. Sign in\"]")).click();
		WebElement textbox=driver1.findElement(By.xpath("//input[@name='email']"));
		textbox.sendKeys("9778727677");
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement textbox1=driver1.findElement(By.xpath("//input[@name='password']"));
		textbox1.sendKeys("dkb2019");
		driver1.findElement(By.id("signInSubmit")).click();*/
		driver1.navigate().back();
		
		Select sel = new Select(driver1.findElement(By.id("searchDropdownBox")));
		sel.selectByVisibleText("Amazon Pantry");
		//sel.selectByIndex(5);
		//sel.selectByValue("search-alias=pantry");
		List<WebElement> options = sel.getOptions();
		for(int i = 0; i < options.size(); i++) {
			if(options.get(i).getText().equals("Amazon Pantry")) {
				options.get(i).click();
			}
		}
	}

}
