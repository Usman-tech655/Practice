package com.key2act.test.DashBoard;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.key2act.pageObjects.Company;
import com.key2act.pageObjects.LoginPage;
import com.key2act.pageObjects.Masterpagefactory;
import com.key2act.work.Actions.DriverManager;

public class EditCompany extends DriverManager {

	LoginPage lp;
	Masterpagefactory mg;
	Company cp;
	
	@BeforeTest
	public void Login() throws IOException
	{
		DriverManager.getDriver().get(prop.getProperty("url"));
		lp = new LoginPage(driver);
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void CompanyCreation()
	{
	    mg = new Masterpagefactory(driver);
	    mg.testName="EditCompany";
	    mg.title="EditCompany";
	    mg.ClickOnAppMenu();
	    mg.ClickonAdmin();	
	    cp = new Company(driver);
	    cp.EditCompany(prop.getProperty("editname"), prop.getProperty("editemail"), prop.getProperty("editphone"), prop.getProperty("editadd"), prop.getProperty("editcity"),
	    		 prop.getProperty("editstate"),prop.getProperty("editzip"));	    
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
