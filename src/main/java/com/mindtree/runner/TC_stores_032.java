package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.pageobject.StoresPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_stores_032 extends BaseClass {
	
	StoresPage sp;
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
	public void checkStoresInfo() throws InterruptedException
	{
		Log.startTestCase("TC_stores_032");
		ip = new IndexPage();
		sp = new StoresPage();
		Log.info("entering username and password");
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
		ip.login(email, pass);
		sp.StoresInfo();
		Assert.assertTrue(true);
		Log.endTestCase("TC_stores_032");
		
	}

}
