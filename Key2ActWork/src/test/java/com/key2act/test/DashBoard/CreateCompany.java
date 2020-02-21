package com.key2act.test.DashBoard;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.key2act.pageObjects.Company;
import com.key2act.pageObjects.LoginPage;
import com.key2act.pageObjects.Masterpagefactory;
import com.key2act.work.Actions.DriverManager;

public class CreateCompany extends DriverManager {

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
	    mg.testName="Company";
	    mg.title="Company";
	    mg.ClickOnAppMenu();
	    mg.ClickonAdmin();	
	    cp = new Company(driver);
	    cp.CreateCompany(prop.getProperty("Companyname"), prop.getProperty("SearchAddress"));	    
	}
}
