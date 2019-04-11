package com.practice.selenium;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BputAboutUs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://bput.ac.in");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='About Us']"))).perform();
		java.util.List<WebElement> lst=driver.findElements(By.xpath("//a[text()='About Us']/..//li"));
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i).getText());
		}
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Governance']"))).perform();
		java.util.List<WebElement> lst1=driver.findElements(By.xpath("//a[text()='Governance']/..//li"));
		for(int j=0;j<lst1.size();j++) {
			System.out.println(lst1.get(j).getText());
		   }
			act.moveToElement(driver.findElement(By.xpath("//a[text()='Academic']"))).perform();
			java.util.List<WebElement>lst4=driver.findElements(By.xpath("//a[text()='Academic']/..//li"));
			for(int m=0;m<lst4.size();m++) {
				System.out.println(lst4.get(m).getText());
				}
			act.moveToElement(driver.findElement(By.xpath("//a[text()='Admission']"))).perform();
				java.util.List<WebElement>lst3=driver.findElements(By.xpath("//a[text()='Admission']/..//li"));
				for(int l=0;l<lst3.size();l++) {
					System.out.println(lst3.get(l).getText());
					}
				act.moveToElement(driver.findElement(By.xpath("//a[text()='Examination']"))).perform();
				java.util.List<WebElement>lst5=driver.findElements(By.xpath("//a[text()='Examination']/..//li"));
				for(int p=0;p<lst5.size();p++) {
					System.out.println(lst5.get(p).getText());
					 }
				act.moveToElement(driver.findElement(By.xpath("//a[text()='PG Department']"))).perform();
				java.util.List<WebElement>lst6=driver.findElements(By.xpath("//a[text()='PG Department']/..//li"));
				for(int q=0;q<lst6.size();q++) {
					System.out.println(lst6.get(q).getText());
				}
				act.moveToElement(driver.findElement(By.xpath("//a[text()='Notices']"))).perform();
				java.util.List<WebElement>lst7=driver.findElements(By.xpath("//a[text()='Notices']/..//li"));
				for(int r=0;r<lst7.size();r++) {
				System.out.println(lst7.get(r).getText());	
				}
				
				act.moveToElement(driver.findElement(By.xpath("//a[text()='Result']"))).perform();
				java.util.List<WebElement>lst10=driver.findElements(By.xpath("//a[text()='Result']/..//li"));
				for(int v=0;v<lst7.size();v++) {
				System.out.println(lst10.get(v).getText());	
				}
				act.moveToElement(driver.findElement(By.xpath("//a[text()='RTI']"))).perform();
				java.util.List<WebElement>lst8=driver.findElements(By.xpath("//a[text()='RTI']/..//li"));
				for(int s=0;s<lst8.size();s++) {
					System.out.println(lst8.get(s).getText());
				}
				act.moveToElement(driver.findElement(By.xpath("//a[text()='Contacts']"))).perform();
				java.util.List<WebElement>lst9=driver.findElements(By.xpath("//a[text()='Contacts']/..//li"));
				for(int t=0;t<lst9.size();t++) {
					System.out.println(lst9.get(t).getText());
					}
				 }
			 }


