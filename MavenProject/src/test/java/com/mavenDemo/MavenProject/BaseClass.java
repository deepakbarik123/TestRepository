package com.mavenDemo.MavenProject;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator.Slicing;

public class BaseClass{
		public static WebDriver driver;
		public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		public WebElement getElement(String path){
			return driver.findElement(By.xpath(path));
		}
		public WebElement getElement(By by){
			return driver.findElement(by);
		}
		public void sendTextToSendBox(String path,String text){
			getElement(path).sendKeys(text);
		}
		public void explicityWait(String path) {
			WebDriverWait wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(getElement(path)));
		}
		public void handleMouseOver(String path){
			Actions act=new Actions(driver);
			act.moveToElement(getElement(path)).perform();
		}
		
		public void takeScreenShot() throws IOException {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("C://Users//USER//Desktop"));
		}
		
		public void selectFromDropdown(String elementXpath, String visibleText, String value, int index) {
			Select sel = new Select(getElement(elementXpath));
			if(!visibleText.isEmpty()) {
				sel.selectByVisibleText(visibleText);
				
			}else if (!value.isEmpty()) {
				sel.selectByValue(value);
			}else {
				sel.selectByIndex(index);
			}
		}
		
		public void handleWindow() {
			String parentId = driver.getWindowHandle();
			Set<String> windows = driver.getWindowHandles();
			for(String window : windows)
			{
				if(!window.equals(parentId))
				{
					driver.switchTo().window(window);
					driver.close();
				}
			}
			driver.switchTo().window(parentId);
			}
		
		public void handleFrame(String frameXpath,String id,int index,WebElement ele) {
			
			 ele =getElement(frameXpath);
			
			if(! id.isEmpty()) {
				driver.switchTo().frame(id);
			}
			
			else if(! ele.isDisplayed()) {
				
				driver.switchTo().frame(ele);				
			}
			else {
				driver.switchTo().frame(index);		
				}
			driver.switchTo().defaultContent();
		      }
		    }
