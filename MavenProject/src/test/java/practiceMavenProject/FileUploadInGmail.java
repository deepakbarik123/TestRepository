package practiceMavenProject;

import java.io.IOException;

import org.openqa.selenium.By;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class FileUploadInGmail extends BaseClass {
	
	public void logIn() throws InterruptedException, IOException {
		openBrowser();
		driver.get("http://gmail.com");
		sendTextToSendBox("//input[@aria-label='Email or phone']", "deepak.cuttack@gmail.com");
		getElement("//span[text()='Next']").click();
		Thread.sleep(5000);
		explicityWait("//input[@name='password']");
		sendTextToSendBox("//input[@name='password']", "9778727677");
		getElement("//span[text()='Next']").click();
		Thread.sleep(5000);
		getElement("//div[text()='Compose']").click();
		Thread.sleep(5000);
		sendTextToSendBox("//textarea[@aria-label='To']", "deepak.cuttack@rediffmail.com");
		sendTextToSendBox("//input[@name='subjectbox']","Passport photo");
		Thread.sleep(5000);
		getElement("//div[@class='a1 aaA aMZ']").click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\photo1.exe");
		Thread.sleep(3000);
		getElement("//div[text()='Send']").click();
		
	}
	public void recipientValidation() throws InterruptedException {
		openBrowser();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		sendTextToSendBox("//input[@id='login1']", "deepak.cuttack@rediffmailmail.com");
		Thread.sleep(5000);
		sendTextToSendBox("//input[@id='password']", "9778727677");
		getElement("//input[@value='Go']").click();
	}
}
