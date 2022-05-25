package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.reusablecomponents.WebdriverHelper;
import com.mindtree.utility.BaseClass;

public class AddToCartPage extends BaseClass {
	
	@FindBy(id="checkout-link")
	WebElement checkoutbtn;
	
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	public void click0()
	{
		WebdriverHelper.click(checkoutbtn);
	}


}
