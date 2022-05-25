package com.mindtree.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mindtree.reusablecomponents.WebdriverHelper;
import com.mindtree.utility.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath = "//input[@id='search']")
	WebElement search;

	@FindBy(id = "search_button")
	WebElement searchbtn;

	@FindBy(xpath = "//*[contains(@class,'header-icon-link user')]")
	WebElement account;

	@FindBy(xpath = "//a[text()='Log In']")
	WebElement loginOption;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutOption;
	
	@FindBy(xpath="//a[text()='Profile']")
	WebElement profileOption;

	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signupOption;

	@FindBy(xpath = "//input[@placeholder='Email Address']")
	WebElement loginUsername;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement loginPass;

	@FindBy(xpath = "//input[@id='ul_site_login']")
	WebElement login;

	@FindBy(xpath = "//input[@id='spree_user_email']")
	WebElement signupUsername;

	@FindBy(xpath = "//input[@id='spree_user_password'][2]")
	WebElement signupPass;

	@FindBy(xpath = "//input[contains(@class,'button primary signup')]")
	WebElement signup;
	
	@FindBy(xpath="//a[contains(@class,'inherit')]")
	WebElement helpbtn;
	
	@FindBy(xpath="//*[@id=\"header\"]//ul[1]/li[2]/a")
	WebElement trackorderbtn;
	
	@FindBy(xpath="//*[@id=\"ulerrors\"]/ul/li")
	WebElement emailAlreadyTakenMsg;
	
	@FindBy(xpath="//a[text()='Show Password']")
	WebElement showpass;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String uname,String passs) throws InterruptedException
	{
		WebdriverHelper.hover(account);
		WebdriverHelper.click(loginOption);
		Thread.sleep(4000l);
		WebdriverHelper.sendText(loginUsername,uname);
		WebdriverHelper.sendText(loginPass,passs);
		WebdriverHelper.click(login);
		
		
	}
	public SearchResultPage searchFunction(String prod)
	{
		WebdriverHelper.sendText(search, prod);

		WebdriverHelper.click(searchbtn);
		return new SearchResultPage();
		
	}
	
	
	public void signup(String name,String pass) throws InterruptedException
	{
		WebdriverHelper.click(account);
		WebdriverHelper.click(signupOption);
		Thread.sleep(4000l);
		WebdriverHelper.sendText(signupUsername, name);
		WebdriverHelper.sendText(signupPass, pass);
		WebdriverHelper.click(signup);
	
	}
	public HelpPage clickhelp()
	{
		WebdriverHelper.click(helpbtn);
		return new HelpPage();
	}
	public String getMTitle()
	{
		String text = driver.getTitle();
		return text;
	}
	public String emailTakenMsg()
	{
		return emailAlreadyTakenMsg.getText();
	}
	public void signupshowpass(String name,String pass) throws InterruptedException
	{
		WebdriverHelper.click(account);
		WebdriverHelper.click(signupOption);
		Thread.sleep(4000l);
		WebdriverHelper.sendText(signupUsername, name);
		WebdriverHelper.sendText(signupPass, pass);
		showpass.click();
		
		
	}
	public void logout(String uname,String passs) throws InterruptedException
	{
		WebdriverHelper.hover(account);
		WebdriverHelper.click(loginOption);
		Thread.sleep(4000l);
		WebdriverHelper.sendText(loginUsername,uname);
		WebdriverHelper.sendText(loginPass,passs);
		WebdriverHelper.click(login);
		WebdriverHelper.hover(account);
		WebdriverHelper.click(logoutOption);
		
		
	}
	public TrackOrderPage trackorder()
	{
		WebdriverHelper.click(trackorderbtn);
		return new TrackOrderPage();
	}
	public ProfilePage validateLogin(String uname,String passs) throws InterruptedException
	{
		WebdriverHelper.hover(account);
		WebdriverHelper.click(loginOption);
		Thread.sleep(4000l);
		WebdriverHelper.sendText(loginUsername,uname);
		WebdriverHelper.sendText(loginPass,passs);
		WebdriverHelper.click(login);
		WebdriverHelper.hover(account);
		WebdriverHelper.click(profileOption);
		return new ProfilePage();
		
		
	}
}
