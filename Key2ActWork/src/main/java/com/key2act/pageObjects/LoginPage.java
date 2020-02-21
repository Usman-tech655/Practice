package com.key2act.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.IBLocators;

public class LoginPage extends ActionClass implements IBLocators{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	By UserName = By.xpath(username);
	By Password = By.xpath(password);
	By Loginbtn = By.xpath(login);
	
	By MyAccountText = By.xpath(MyAccounttext);

	By Signout = By.xpath(signout);
	By ApplicationMenu = By.xpath(appmenu);
	
		
    public void Login(String username, String pswd, String text)
    {
	   click(UserName);
	   writeText(UserName, username);
	   writeText(Password, pswd);
	   click(Loginbtn);
	   waitForPageToLoad();
	   Assert.assertEquals(readText(MyAccountText), text);
    }
    public void Login(String username, String pswd)
    {
	   click(UserName);
	   writeText(UserName, username);
	   writeText(Password, pswd);
	   click(Loginbtn);
	   waitForPageToLoad();	   
    }


}
