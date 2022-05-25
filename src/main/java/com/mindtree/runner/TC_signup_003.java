package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_signup_003 extends BaseClass {
	
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
	public void AlreadyTakenEmail() throws InterruptedException
	{
		Log.startTestCase("TC_signup_003");
		String msg2 = prop.getProperty("msg1");
		ip = new IndexPage();
		Log.info("entering already signed up username and password");
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
	    ip.signup(email, pass);
	    Log.info("email already taken message displayed");
		String msg = ip.emailTakenMsg();
		Assert.assertEquals(msg, msg2);
		Log.endTestCase("TC_signup_002");
		
	}

}
