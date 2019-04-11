package com.TestNG.practice;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BmethodAmethod {
	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://bput.ac.in");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

	@Test
	public void examBput() {
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Examination']"))).perform();
		driver.findElement(By.xpath("//a[text()='Exam Schedule']")).click();
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='ddlSession']")));
		sel.selectByIndex(1);
		Select sel1 = new Select(driver.findElement(By.xpath("//select[@name='ddlCourse']")));
		sel1.selectByVisibleText("B.Tech");
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@name='DDLBranch']")));
		sel2.selectByVisibleText("B.Tech.(APPLIED ELECTRONICS & INSTRUMENTATION ENGINEERING)");
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='DDLSemester']")));
		sel3.selectByVisibleText("7th Semester");
		driver.findElement(By.xpath("//input[@value='View']")).click();
	}
	@Test
	public void bputNotice$Result() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//a[text()='Result']")).click();
		String parentwin=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		for(String win:windows) {
			if(!(parentwin.equals(win))) {
				driver.switchTo().window(win);
				}
		}
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//select[@id='ddlSession']"))));
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='ddlSession']")));
		sel.selectByVisibleText("Odd-2013");
		driver.findElement(By.xpath("//input[@placeholder='Enter Registration No']")).sendKeys("0901215227");
		driver.findElement(By.xpath("//input[@class='riTextBox riEnabled']")).sendKeys("8/7/1991");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		System.out.println(driver.findElement(By.xpath("//h3[text()='No record found!!']")).getText());
		driver.switchTo().window(parentwin);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Notices']"))).perform();
		driver.findElement(By.xpath("//a[text()='Students Notice']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Next »']"))));
		driver.findElement(By.xpath("//a[text()='Next »']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Holiday List for 2015']"))));
		driver.findElement(By.xpath("//a[text()='Holiday List for 2015']")).click();
		}
	}
