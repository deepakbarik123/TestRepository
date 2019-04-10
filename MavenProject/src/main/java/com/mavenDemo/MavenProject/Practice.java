package com.mavenDemo.MavenProject;

import org.testng.annotations.Test;

public class Practice extends BaseClass{

	@Test
	public void exicute()
	{
		openBrowser();	
		driver.get("http://facebook.com");
		sendTextToSendBox("//div[text()='First name", "deepak");
	}

}
