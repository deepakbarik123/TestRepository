package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownOptimized extends Flipkart{
	
	public static void selectDropdown(String path,String text) {
		Select sel = new Select(driver.findElement(By.xpath(path)));
		sel.selectByVisibleText(text);
	}
	public static void main(String[] args) {
		openBrowser();
		driver.get("http://facebook.com");
		selectDropdown("//select[@name='birthday_day']", "18");
		selectDropdown("//select[@name='birthday_month']", "Apr");
		selectDropdown("//select[@name='birthday_year']", "1992");
	}

}
