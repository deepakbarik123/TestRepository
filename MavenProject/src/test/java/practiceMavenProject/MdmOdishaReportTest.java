/**
 * 
 */
package practiceMavenProject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

/*
  @CodeFreak Deepak
 */
public class MdmOdishaReportTest extends MdModishaHomepage {
	
	@Test
	public void MDMreports() throws InterruptedException, IOException {
		
		dailyMDMreports();
		assertEquals(getElement("//tbody[@id='viewBody']").getText(),getElement("//tbody[@id='viewBody']").getText());
		
	}
	@Test(dependsOnMethods="MDMreports")
	public void cookingCostReports() throws InterruptedException {
		
		cookingCostReport();
		
	}

}
