package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.reusablecomponents.WebdriverHelper;
import com.mindtree.utility.BaseClass;

public class SearchResultPage extends BaseClass{
	
	
	
	@FindBy(xpath="//*[@class='product-img-default']")
	WebElement searchresult;
	
	@FindBy(xpath="//*[@class='icofont icofont-heart_outline_thick wishicon']")
	WebElement wishl;
	
	@FindBy(xpath="//li[@data-group='category']//div[@class='gname']")
	WebElement pricefilter;
	
	@FindBy(xpath="//input[@id='filters_primary_category_Table_Lamps']")
	WebElement pricecategory;
	
	@FindBy(xpath="//div[@class='product-title product-title-sofa-mattresses']//span[@class]")
	WebElement productName;
	@FindBy(xpath = "//button[@data-gacategory='product']")
	WebElement addtocartbtn;
	
	
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public ProductDescriptionPage click1()
	{
		WebdriverHelper.click(searchresult);
		return new ProductDescriptionPage();
	}
	
	
	public void wishlistadd()
	{
		WebdriverHelper.click(wishl);
	}
	
	public String pricefunc()
	{
		WebdriverHelper.click(pricefilter);
		WebdriverHelper.click(pricecategory);
		String name1 = productName.getText();
		return name1;
	}
	

	
	public void clickproduct()
	{
		WebdriverHelper.click(searchresult);
		
	}
	



}
