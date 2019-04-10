/**
 * 
 */
package practiceMavenProject;

import org.testng.annotations.Test;

import com.mavenDemo.MavenProject.BaseClass;

/*
  @CodeFreak Deepak
 */
public class FrameHandlePractice extends BaseClass {
	@Test
	public void practiceframe() throws InterruptedException {
		
		openBrowser();
		driver.get("https://seller.flipkart.com/?utm_source=flipkart&utm_medium=website&utm_campaign=sellbutton");
		
		//handleFrame("//iframe[@src='https://www.youtube.com/embed/2z3nFGGXDLM?rel=0&controls=0&showinfo=0']", "", 0, " ");

		driver.switchTo().frame(getElement("//iframe[@src='https://www.youtube.com/embed/2z3nFGGXDLM?rel=0&controls=0&showinfo=0']"));
		 getElement("//button[@aria-label='Play']").click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		 getElement("//a[@href='/slp/faqs']");
		 driver.close();
	}
	

}
