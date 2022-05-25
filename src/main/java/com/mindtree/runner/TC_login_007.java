package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.pageobject.ProfilePage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_login_007 extends BaseClass{
	
IndexPage indexpage;
ProfilePage pp;
	
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
	public void loginTest() throws InterruptedException
	{
		

		Log.startTestCase("TC_login_007");
		indexpage = new IndexPage();
		Log.info("user is clicked on login");
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String textt = prop.getProperty("LoginVal");
		pp = indexpage.validateLogin(email, pass);
		String textt1 = pp.profileDetail();
		Log.info("user enters username and password");
		Log.info("user will be login to the application");
		Log.endTestCase("TC_login_007");
		Assert.assertEquals(textt,textt1);
	}

}
