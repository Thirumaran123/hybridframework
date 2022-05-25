package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSS {
	
	public static String ss(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
		Date d = new Date();
		String date = sdf.format(d);
		String ss = System.getProperty("user.dir")+"/ScreenShot/"+"err"+date+"err.png";
		File dest = new File(ss);
		FileUtils.copyFile(src, dest);
		return ss;
	}

}
