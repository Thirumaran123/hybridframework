package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.utility.BaseClass;

public class CheckoutPage extends BaseClass {
	
	@FindBy(id="address-form-submit")
	WebElement submitbtn;
	
	@FindBy(id="order_email")
	WebElement email;
	
	@FindBy(xpath="//input[contains(@id,'order_ship_address_attributes_zipcode')]")
	WebElement pincode;
	
	@FindBy(xpath="//textarea[contains(@id,'order_ship')]")
	WebElement address;
	
	@FindBy(xpath="//input[contains(@id,'order_ship_address_attributes_firstname')]")
	WebElement firstname;
	
	@FindBy(xpath="//input[contains(@id,'order_ship_address_attributes_lastname')]")
	WebElement lastname;
	
	@FindBy(xpath="//input[contains(@id,'order_ship_address_attributes_phone')]")
	WebElement phone;
	
	@FindBy(xpath="//input[contains(@id,'order_use_shipping')]")
	WebElement checkbox;
	
	

	
	
	
	
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

}
