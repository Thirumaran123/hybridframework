package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_verifytitle_001 extends BaseClass{
	
	IndexPage indexpage;
	
	@BeforeMethod
	public void setup()
	{
		launchBrowser();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void verifyTitle()
	{
		Log.startTestCase("TC_verifytitle_001");
		String title1 = prop.getProperty("title");
		indexpage = new IndexPage();
		String title = indexpage.getMTitle();
		Log.info("validating title of the webpage");
		Assert.assertEquals(title, title1);
		Log.endTestCase("TC_verifytitle_001");
		
		
	}

}
