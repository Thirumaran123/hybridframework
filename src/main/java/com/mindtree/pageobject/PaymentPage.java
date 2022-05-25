package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.utility.BaseClass;

public class PaymentPage extends BaseClass {
	
	@FindBy(xpath="//input[contains(@value,'Place Order')]")
	WebElement orderbtn;
	
	
	
	
	
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

}
