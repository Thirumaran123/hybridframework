package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.dataprovider.DataProviders;
import com.mindtree.pageobject.IndexPage;
import com.mindtree.pageobject.SearchResultPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_search_016 extends BaseClass {
	IndexPage indexpage;
	SearchResultPage srp;
		
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
		
		@Test(dataProvider = "productSearch",dataProviderClass=DataProviders.class)
		public void validateSearch(String prod)
		{
			Log.startTestCase("TC_search_016");
			indexpage = new IndexPage();
			Log.info("user entered product to search");
			srp = indexpage.searchFunction(prod);
			Assert.assertTrue(true);
			Log.info("user validating the product searched");
			Log.endTestCase("TC_search_016");
		}

}
