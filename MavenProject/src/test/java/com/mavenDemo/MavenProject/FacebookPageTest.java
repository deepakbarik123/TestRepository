/**
 * 
 */
package com.mavenDemo.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class FacebookPageTest extends FacebookLoginPage
	{
	@DataProvider
	public Object[][] getUsernameAndPassword() {
		Object[][] datas = {{"deepak.cuttack@gmail", "123ABC"},{"deepak.cuttack@gmail", "password"}};
		return datas;
		
	}
	
	@DataProvider(name = "signUp")
	public Object[][] getSignUpData() {
		Object[][] data = {{"Deepak"},{"bapi"},{"happy"}};
		return data;
		}
	@DataProvider(name="fullName")
	public Object[][] getfullName() {
	Object[][] names= {{"Deepak","Kumar"},{"Deepak","Barik"}};
	return names;
	    }
	
	//@Test(dataProvider = "getUsernameAndPassword")
	public void m1(String username, String password) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		loginWithValidCredentials(username, password);
		Thread.sleep(5000);
		//validElements();
	}
	
	//@Test(dataProvider = "signUp")
	public void m2(String firstName) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		getElement(this.firstName).sendKeys(firstName);
		//validElements();
	}
	//@Test(dataProvider="fullName")
	public void enterTheFullName(String firstName,String lastname) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		}
	
	@Test
	public void contentInfoLinks() throws InterruptedException {
		openBrowser();
		driver.get("http://facebook.com");
		validElements();
		validateSignUpFieldLinks();
		}
	}
	