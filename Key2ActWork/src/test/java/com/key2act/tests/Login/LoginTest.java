package com.key2act.tests.Login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.key2act.Utility.PropertyReader;
import com.key2act.pageObjects.LoginPage;
import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.DriverManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LoginTest extends DriverManager {
	
	LoginPage lp;
	public static ExtentReports extent;
	public static ExtentTest test;
	@BeforeTest
	public void BrowserSetup() throws IOException
	{
		DriverManager.getDriver().get(prop.getProperty("url"));
		extent = new ExtentReports(System.getProperty("user.dir") + "/target/reports/ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "Key2ActWork").addSystemInfo("Environment", "Extent Report")
				.addSystemInfo("User Name", System.getProperty("user.name")).addSystemInfo("os", System.getenv("OS"))
				.addSystemInfo("Java Home", System.getenv("JAVA_HOME"))
				.addSystemInfo("user.dir: ", System.getProperty("user.dir"));
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
	}
	@Test
	public void Login()
	{
		lp = new LoginPage(driver);
		lp.testName="Login";
		lp.title="Login";
		lp.Login(prop.getProperty("username"), prop.getProperty("password"),"My Account");
	}
	@AfterTest
	public void tearDown()
	{
		extent.endTest(test);
		driver.quit();		
	}
}
