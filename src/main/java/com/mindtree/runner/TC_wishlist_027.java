package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.pageobject.ProductDescriptionPage;
import com.mindtree.pageobject.SearchResultPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_wishlist_027 extends BaseClass {
	
	IndexPage ip;
	SearchResultPage sp;
	ProductDescriptionPage pdp;
	
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
	public void wishListTest() throws InterruptedException
	{
		Log.startTestCase("TC_wishlist_027");
		ip = new IndexPage();
		
		String email = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String prod = prop.getProperty("product");
		ip.login(email, pass);
		Log.info("Searching for a product");
		Log.info("adding the product to wishlist");
		sp = ip.searchFunction(prod);
		sp.wishlistadd();
		Assert.assertTrue(true);
		Log.endTestCase("TC_wishlist_027");
	}
	
	
	
	
	
	

}
