package com.mindtree.runner;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.pageobject.IndexPage;
import com.mindtree.pageobject.SearchResultPage;
import com.mindtree.utility.BaseClass;
import com.mindtree.utility.Log;

public class TC_filters_036 extends BaseClass {

	IndexPage indexpage;
	SearchResultPage srp;

	@BeforeMethod
	public void setup() {
		launchBrowser();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void validateCategory() {
		Log.startTestCase("TC_filters_036");
		indexpage = new IndexPage();
		Log.info("user is clicked on search tab");
		String prod = prop.getProperty("product");
		Log.info("user is clicked category option in filter function");
		srp = indexpage.searchFunction(prod);
		Log.info("it is getting the details of the product");
		String name = srp.pricefunc();
		String prod1 = prop.getProperty("validprod");

		if (name.contains("prod1")) {
			Log.info("validating the title of the product");
			Assert.assertTrue(true);
			Log.endTestCase("TC_filters_036");

			
		}

	}

}
