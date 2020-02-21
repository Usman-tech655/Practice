package com.key2act.test.IOTHub;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.key2act.pageObjects.IOTHub;
import com.key2act.pageObjects.LoginPage;
import com.key2act.pageObjects.Masterpagefactory;
import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.DriverManager;

public class ManageAgent  extends DriverManager{
	LoginPage lp;
	Masterpagefactory mg;
	IOTHub iot;
	
	@BeforeTest
	public void Login() throws IOException
	{
		DriverManager.getDriver().get(prop.getProperty("url"));
		lp = new LoginPage(driver);
		lp.testName="ManageAgent";
		lp.title="ManageAgent";
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@Test
	public void AgentAction(){
		mg= new Masterpagefactory(driver);
		mg.ClickOnAppMenu();
		mg.waitForPageToLoad();
		iot = new IOTHub(driver);
		ActionClass.testName="ManageAgent";
		ActionClass.title="ManageAgent";
		iot.AgAction();
		
	}

}
