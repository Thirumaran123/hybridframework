package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.utility.BaseClass;

public class OrdersPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"app-container\"]/div/main/section/h1")
	WebElement msg;
	

	public OrdersPage() {
		PageFactory.initElements(driver, this);
	}

}
