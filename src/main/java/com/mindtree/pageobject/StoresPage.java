package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.reusablecomponents.WebdriverHelper;
import com.mindtree.utility.BaseClass;

public class StoresPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"header\"]/section/div/ul[2]//a")
	WebElement storestile;
	
	@FindBy(xpath="//button[text()='View Details']")
	WebElement storesclick;
	
	public StoresPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void StoresInfo()
	{
		WebdriverHelper.click(storestile);
		WebdriverHelper.click(storesclick);
	}
	

}
