package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.pageobject.TrackOrderPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_trackorder_024 extends BaseClass {
	
IndexPage indexpage;
TrackOrderPage top;
	
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
	public void trackOrderFeature() throws InterruptedException
	{
		Log.startTestCase("TC_trackorder_024");
		indexpage = new IndexPage();
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
		indexpage.login(email, pass);
		top = indexpage.trackorder();
		Log.info("navigating to storespage");
		
		String msgg = top.msg();
		String msg1 = "WE ARE YET TO RECEIVE YOUR FIRST ORDER";
		Assert.assertEquals(msgg, msg1);
		Log.endTestCase("TC_trackorder_024");
	}

}
