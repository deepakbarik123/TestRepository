package com.mavenDemo.MavenProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipkartSeller {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://flipkart.com");
	}
	
	//@BeforeMethod
	public WebElement getElement(String path) {
		return driver.findElement(By.xpath(path));
		}
		public void sendText(String path,String text) {
			getElement(path).sendKeys(text);
		}
	
	@Test
	public void playvideo() throws InterruptedException, IOException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		getElement("//button[@class='_2AkmmA _29YdH8']").click();
		Actions act=new Actions(driver);
		act.moveToElement(getElement("//div[text()='More']")).perform();
		getElement("//div[text()='Sell on Flipkart']").click();
		
		driver.switchTo().frame(getElement("//iframe[contains(@src,'https://www.youtube.com/')]"));
		getElement("//button[@aria-label='Play']").click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(getElement("//div[@class='ytp-share-icon']")));
		getElement("//div[@class='ytp-share-icon']").click();
		wait.until(ExpectedConditions.visibilityOf(getElement("//button[@class='ytp-share-panel-close ytp-button']")));
		getElement("//button[@class='ytp-share-panel-close ytp-button']").click();
		driver.switchTo().defaultContent();
		
		getElement("//a[text()='View more stories']").click();
		wait.until(ExpectedConditions.visibilityOf(getElement("//a[text()='Start Selling']")));
		getElement("//a[text()='Start Selling']").click();
		sendText("//input[@name='user_name']", "Deepak");
		sendText("//input[@name='user_email_id']", "deepak.cuttack@gmail.com");
		sendText("//input[@name='user_pass']", "hjiklimnb");
		sendText("//input[@name='user_phone']", "9778727677");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\USER\\Desktop\\New folder\\abc.png"));
		
		}

}
