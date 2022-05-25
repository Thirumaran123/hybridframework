package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.reusablecomponents.WebdriverHelper;
import com.mindtree.utility.BaseClass;

public class ProductDescriptionPage extends BaseClass {

	@FindBy(xpath = "//button[@data-gacategory='product']")
	WebElement addtocartbtn;

	@FindBy(xpath = "//span[text()='Add to Wishlist']")
	WebElement wishlistbtn;

	public ProductDescriptionPage() {
		PageFactory.initElements(driver, this);
	}

	public CheckoutPage click1() throws InterruptedException {
		Thread.sleep(8000l);
		WebdriverHelper.scrollByVisibilityOfElement(driver, addtocartbtn);
		Thread.sleep(8000l);
		return new CheckoutPage();

	}

	public void wishlist() {
		wishlistbtn.click();
	}

}
