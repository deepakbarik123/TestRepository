package com.mavenDemo.MavenProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage extends BaseClass{
	
	By usernameTextBox = By.name("email");
	By passwordTextBox = By.name("pass");
	By loginButton = By.xpath("//input[@value='Log In']");
	By forgottenAccount=By.xpath("//a[text()='Forgotten account?']");
	By firstName=By.xpath("//input[@name='firstname']");
	By surName=By.xpath("//input[@name='lastname']");
	By mobileNumber=By.xpath("//input[@name='reg_email__']");
	By newPassword=By.xpath("//input[@name='reg_passwd__']");
	By birthDate=By.xpath("//select[@title='Day']");
	By birthMonth=By.xpath("//select[@title='Month']");
	By year=By.xpath("//select[@title='Year']");
	By radioButtonFemale=By.name("//label[text()='Female']");
	By radioButtonMale=By.name("//label[text()='Male']");
	By whydoIneed=By.xpath("//a[text()='Why do I need to provide my date of birth?']");
	By terms=By.xpath("//a[@id='terms-link']");
	By dataPolicy=By.xpath("//a[text()='Data Policy']");
	By cookiePolicy=By.xpath("//a[text()='Cookie Policy']");
	By signUpBig=By.xpath("//button[@name='websubmit']");
	By createCeleBrityPage=By.xpath("//a[text()='Create a Page']");
	By languagePlus=By.xpath("//a[@title='Show more languages']");
	By signUpSmall=By.xpath("//a[@title='Sign up for Facebook']");
	By logInLink=By.xpath("//a[text()='Log In']");
	By messengerLink=By.xpath("//a[text()='Log In']");
	By faceBookLite=By.xpath("");
	By findfriends=By.xpath("");
	By peoples=By.xpath("");
	By profiles=By.xpath("");
	By pages=By.xpath("");
	By pageCategories=By.xpath("");
	By place=By.xpath("");
	By games=By.xpath("");
	By locations=By.xpath("");
	By marketPlace=By.xpath("");
	By groups=By.xpath("");
	By instaGram=By.xpath("");
	By local=By.xpath("");
	By fundRaisers=By.xpath("");
	By events=By.xpath("");
	By about=By.xpath("");
	By createAd=By.xpath("");
	By createPage=By.xpath("");
	By developers=By.xpath("");
	By careers=By.xpath("");
	By privacy=By.xpath("");
	By cookies=By.xpath("");
	By adChoices=By.xpath("");
	By term1s=By.xpath("");
	By accountSecurity=By.xpath("");
	By loginHelp=By.xpath("");
	By help=By.xpath("");
	By facebookLargeLogo=By.xpath("");
	String title = "log in or sign up";
	
	public boolean validateLoginPage() {
		boolean status;
		if(driver.getTitle().contains(title)) {
			 status = true;
		}else {
			status = false;
		}
		
		if(getElement(help).isDisplayed()) {
			 status = true;
		}else {
			status = false;
		}
		return status;
	}
	
	public void clickOnLoginButton() {
		getElement(loginButton).click();
	}
	public  void clickOnElement(By element) {
		getElement(element).click();
		}
	
	public void loginWithValidCredentials(String username, String password) {
		getElement(usernameTextBox).sendKeys(username);
		getElement(passwordTextBox).sendKeys(password);
		clickOnLoginButton();
	}
	public void logInwithInvalidCredential(String username,String password) {
		getElement(usernameTextBox).sendKeys(username);
		getElement(passwordTextBox).sendKeys(password);
		clickOnLoginButton();
		}
	public void forgottenAccount() {
		clickOnElement(forgottenAccount);
		}
	public void validateSignUpFieldLinks() throws InterruptedException {
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='large_form']//a"));
		for(int i = 1; i < elements.size(); i++) {
			elements.get(i).click();
			Thread.sleep(5000);
			handleWindow();
		}
		}
	
		public void validElements() throws InterruptedException {
		List<WebElement> elementz=driver.findElements(By.xpath("//div[@role='contentinfo']//a"));
			for(int index=0;index<(elementz.size()-2);index++) {
				elementz=driver.findElements(By.xpath("//div[@role='contentinfo']//a"));
				elementz.get(index).click();
				Thread.sleep(2000);
				driver.navigate().back();	
				Thread.sleep(2000);
			}
			
		}
		
	}








