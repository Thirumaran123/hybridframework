package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.utility.BaseClass;

public class ProfilePage extends BaseClass {
	
	@FindBy(xpath = "//*[@id=\"content\"]//h1")
	WebElement text1;
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String profileDetail()
	{
		String te = text1.getText();
		return te;
	}
	

}
