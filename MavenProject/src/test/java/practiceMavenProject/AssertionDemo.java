/**
 * 
 */
package practiceMavenProject;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class AssertionDemo extends BaseClass {
	@Test
	public void assertion() {
		openBrowser();
		driver.get("https://gmail.com");
		
		System.out.println("Navigated to gmail page");
		/*if(getElement("").isDisplayed()) {
			System.out.println("element is displayed");
		}
		else
		{
			
		}*/
		if(getElement("").getText().equals("") ) {
			
		}
		
		Assert.assertEquals(getElement("").getText(), "");
		Assert.assertTrue(getElement("").isDisplayed(),"Element is not displayed");
		Assert.assertFalse(getElement("notifaction").isDisplayed());
		
			
	}

}
