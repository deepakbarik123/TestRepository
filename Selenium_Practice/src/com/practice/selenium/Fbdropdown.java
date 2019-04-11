package com.practice.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdropdown {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver2=new ChromeDriver();
		driver2.get("http:facebook.com");
		
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement textbox1=driver2.findElement(By.xpath("//input[@name=\"firstname\"]"));
		Thread.sleep(5000);
		textbox1.sendKeys("Deepak");
		
		WebElement textbox2=driver2.findElement(By.xpath("//input[@name='lastname']"));
		textbox2.sendKeys("Barik");
		
		WebElement textbox3=driver2.findElement(By.xpath("//input[@name='reg_email__']"));
		textbox3.sendKeys("deepak.cuttack@gmail.com");
		
		WebElement textbox4=driver2.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		textbox4.sendKeys("deepak.cuttack@gmail.com");
		
		WebElement textbox5=driver2.findElement(By.xpath("//input[@name='reg_passwd__']"));
		textbox5.sendKeys("deepak.cuttack@gmail.com");
		
		WebElement day=driver2.findElement(By.xpath("//*[@id=\"day\"]"));
		Select sel1=new Select(day);
		sel1.selectByValue("18");
		
		Select sel2=new Select(driver2.findElement(By.xpath("//select[@name='birthday_month']")));
		sel2.selectByValue("7");
		
		/*WebElement month=driver2.findElement(By.xpath("//select[@id='month']"));
		Select sel2=new Select(month);
		sel2.selectByIndex(7);*/
		
		WebElement year=driver2.findElement(By.xpath("//*[@id=\"year\"]"));
		Select sel3=new Select(year);
		sel3.selectByVisibleText("2002");
		
		
		/*Select sel = new Select(driver2.findElement(By.id("day")));
		sel.selectByVisibleText("18");
		
		Select sel1 = new Select(driver2.findElement(By.id("month")));
		sel1.selectByVisibleText("Jun");
		
		Select sel2 = new Select(driver2.findElement(By.id("year")));
		sel2.selectByVisibleText("2001");*/
		
		/*List<String> lst = new ArrayList<String>();
		lst.add("Dipak");
		lst.add("kumar");
		lst.add("Barik");
		System.out.println(lst);
		System.out.println(lst.get(2));
		
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(3);
		lst1.add(4);
		System.out.println(lst1);
		System.out.println(lst1.get(1));*/
		
		
	}

}
