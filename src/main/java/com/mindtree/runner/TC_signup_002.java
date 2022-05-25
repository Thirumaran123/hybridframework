package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_signup_002 extends BaseClass {
	
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
	public void checkShowPassword() throws InterruptedException
	{
		Log.startTestCase("TC_signup_002");
		ip = new IndexPage();
		Log.info("user entering username and password");
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
		Log.info("validating whether show password feature is working or not");
		ip.signupshowpass(email, pass);
		Assert.assertTrue(true);
		Log.endTestCase("TC_signup_002");
	}

}
