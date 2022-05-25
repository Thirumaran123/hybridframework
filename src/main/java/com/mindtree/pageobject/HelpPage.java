package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.utility.BaseClass;

public class HelpPage extends BaseClass {
	
	@FindBy(xpath="//h1[text()='Help Center']")
	WebElement text;
	
	public HelpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String geTTitle()
	{
		String text1 = text.getText();
		return text1;
	}

}
