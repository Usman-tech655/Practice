package com.key2act.test.IOTHub;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.key2act.pageObjects.Company;
import com.key2act.pageObjects.IOTHub;
import com.key2act.pageObjects.LoginPage;
import com.key2act.pageObjects.Masterpagefactory;
import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.DriverManager;

public class CreateNewAgent extends DriverManager{
	
	LoginPage lp;
	Masterpagefactory mg;
	IOTHub iot;
	
	@BeforeTest
	public void Login() throws IOException
	{
		DriverManager.getDriver().get(prop.getProperty("url"));
		lp = new LoginPage(driver);
		lp.testName="CreateAgent";
		lp.title="CreateAgent";
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	public void AgentCreation()
	{
		mg = new Masterpagefactory(driver);
		mg.ClickOnAppMenu();
		mg.waitForPageToLoad();
		iot = new IOTHub(driver);
		ActionClass.testName="CreateAgent";
		ActionClass.title="CreateAgent";
		iot.CreateAgent(prop.getProperty("CreatAgent"), prop.getProperty("Serial"), prop.getProperty("TimeZone"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
