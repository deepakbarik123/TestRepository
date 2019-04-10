/**
 * 
 */
package practiceMavenProject;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

/*
  @CodeFreak Deepak
 */
public class FileUploadInGmailTest extends FileUploadInGmail {
	@Test
	public void scenaRio1() throws InterruptedException, IOException {
		logIn();
		
	}
	@Test
	public void scenaRio1Vaklidation() throws InterruptedException {
		
		recipientValidation();
		assertTrue(getElement("//li[@subject='Passport photo']").isDisplayed());
	}
}
