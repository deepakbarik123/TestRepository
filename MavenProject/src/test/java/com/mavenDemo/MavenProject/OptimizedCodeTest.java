package com.mavenDemo.MavenProject;

import java.io.IOException;

import org.testng.annotations.Test;

public class OptimizedCodeTest extends BaseClass {
	/*@Test
	public void test1() {
	openBrowser();
	driver.get("http://facebook.com");
}*/
	@Test
	public void test2() throws InterruptedException {
		openBrowser();	
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		getElement("//input[@name='firstname']").sendKeys("deepak");
		getElement("//input[@name='lastname']").sendKeys("barik");
		getElement("//input[@name='reg_email__']").sendKeys("9778727677");
	}
	@Test
	public void test3() 
	{
		openBrowser();	
		driver.get("http://facebook.com");
		sendTextToSendBox("//input[@name='firstname']", "deepak");
		sendTextToSendBox("//input[@name='lastname']", "barik");
	}
	@Test
	public void test4() throws IOException {
		openBrowser();
		driver.get("http://facebook.com");
		//screenShot();
		selectFromDropdown("//select[@name='birthday_month']", "", "", 6);
		selectFromDropdown("//select[@name='birthday_day']", "20", "",0 );
		selectFromDropdown("//select[@name='birthday_year']", "", "1997", 0);
		}

}
