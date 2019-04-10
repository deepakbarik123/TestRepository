/**
 * 
 */
package practiceMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class PracticeTestNG extends BaseClass {
	@Test
	public void getPageTitle() {
		openBrowser();
		driver.get("https://education.newkerala.com/india-education/Journalism-and-Mass-Communication.html");
		
		String actualTitle = driver.getPageSource();
		String expectedTitle = "Journalism and Mass Communication - Education in India, Courses &amp; Studies @ NewKerala.Com";
		Assert.assertTrue(actualTitle.contains("Journalism and Mass Communication"));
		
		System.out.println("Page title verified");
		
		
	}

}
