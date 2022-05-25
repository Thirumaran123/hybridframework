package com.mindtree.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	@BeforeSuite
	public void logConfig() {
		DOMConfigurator.configure("log4j.xml");
		ExtentManager.setExtent();
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\Testdata\\config.properties");
			prop.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public void launchBrowser() {
		String browsername = prop.getProperty("browser");
		if (browsername.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));

			driver = new ChromeDriver();
		} else if (browsername.contains("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.contains("ie")) {
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void afterSuite() {
		ExtentManager.endReport();
	}

}
