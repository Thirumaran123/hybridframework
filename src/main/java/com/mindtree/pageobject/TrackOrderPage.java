package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.utility.BaseClass;

public class TrackOrderPage extends BaseClass {
	
	@FindBy(xpath="//h3[text()='We are yet to receive your first order']")
	WebElement msg1;
	
	public TrackOrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String msg()
	{
		String text = msg1.getText();
		return text;
	}

}
