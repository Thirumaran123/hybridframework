package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_logout_013 extends BaseClass {
	
	IndexPage ip;
	
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
	public void checkLogoutFunction() throws InterruptedException
	{
		Log.startTestCase("TC_logout_013");

		ip = new IndexPage();
		Log.info("user entering username and password");
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
		Log.info("checking logout functionality");
		ip.logout(email, pass);
		Assert.assertTrue(true);
		Log.endTestCase("TC_logout_013");
	}
	

}
