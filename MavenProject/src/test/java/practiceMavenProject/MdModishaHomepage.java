/**
 * 
 */
package practiceMavenProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class MdModishaHomepage extends BaseClass {
	
	public void dailyMDMreports() throws InterruptedException, IOException {
		
		openBrowser();
		driver.get("http://mdmodishasms.nic.in");
		handleMouseOver("//button[text()='Daily MDM Report']");
		Thread.sleep(5000);
		getElement("//h5[text()='MDM Served Report']").click();
		getElement("//input[@name='mdmReportedDate']").click();
		getElement("//a[@class='btn-ok']");
		Thread.sleep(5000);
		getElement("//a[text()='BARGARH']").click();
		getElement("//a[text()='ATTABIRA']").click();
		sendTextToSendBox("//input[@class='input-medium']", "chakuli");
		Thread.sleep(3000);
		String report=getElement("//tbody[@id='viewBody']").getText();
	}
	public void cookingCostReport() throws InterruptedException {
		
		openBrowser();
		driver.get("http://mdmodishasms.nic.in");
		handleMouseOver("//button[text()='Fund And Food Report']");
		Thread.sleep(5000);
		getElement("//a[contains(@href,'cookingCostDetails.html?OWASP_CSRFTOKEN=KVBN')]").click();
		getElement("//input[@name='_tabletMonthYear']").click();
		selectFromDropdown("//select[@class='ui-datepicker-month']", " ", "Feb",0);
		getElement("//input[@id='btn_sumbit_attMonthYear22']").click();
		assertEquals(getElement("//div[@class='panel-heading ph']").getText(),getElement("//div[@class='panel-heading ph']").getText());
		
	}

}
