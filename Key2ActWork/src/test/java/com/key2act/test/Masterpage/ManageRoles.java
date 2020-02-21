package com.key2act.test.Masterpage;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.key2act.pageObjects.LoginPage;
import com.key2act.pageObjects.Masterpagefactory;
import com.key2act.pageObjects.userRoles;
import com.key2act.work.Actions.DriverManager;

public class ManageRoles extends DriverManager {

	LoginPage lp;
	Masterpagefactory mp;
	userRoles roles;
	@BeforeTest
	public void Login() throws IOException
	{
		DriverManager.getDriver().get(prop.getProperty("url"));
		lp = new LoginPage(driver);
		lp.testName="EditRole";
		lp.title="EditRole";
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void ManageUser()
	{
		mp = new Masterpagefactory(driver);	
		mp.testName="EditRole";
		mp.title="EditRole";
		mp.ClickOnAppMenu();
		mp.ClickonAdmin();
		roles = new userRoles(driver);
		roles.ManageRole(prop.getProperty("rolename"), prop.getProperty("roledes"));
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
