package com.key2act.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.IBLocators;


public class Company extends ActionClass implements IBLocators {
	public WebDriver driver;
	
	public Company(WebDriver driver)
	{
		super(driver);
	}
	
	By Company = By.xpath(company);
	By DefaultCompanybtn = By.xpath(defaultCompanybtn);
	By CreateNewCompany = By.xpath(createNewCompany);
	By Edit_Company = By.xpath(edit_Company);
	By Change = By.xpath(change);
	By Update = By.xpath(update);
	By newPassword = By.xpath(NewPassword);
	By Create1 = By.xpath(create1);
	By Cname= By.xpath(cname);
	By Ctr=  By.xpath(ctr);
	By Type = By.xpath(type);
	By Type2= By.xpath(type2);
	By Type3= By.xpath(type3);
	By Type4= By.xpath(type4);
	By address = By.xpath(Address);
	By address1 = By.xpath(Address1);
	By city = By.xpath(City);
	By zipcode = By.xpath(Zipcode);
	By cancel = By.xpath(Cancel);
	By create  = By.xpath(Create);
	By editCompany = By.xpath(EditCompany);
	By editName = By.xpath(EditName);
	By editEmail = By.xpath(EditEmail);
	By editPhone = By.xpath(EditPhone);
	By editAdd = By.xpath(EditAdd);
	By editCity = By.xpath(EditCity);
	By editState = By.xpath(EditState);
	By editZip = By.xpath(EditZip);
	
	
	public void CreateCompany(String cname, String Address)
	{
		click(DefaultCompanybtn);
		click(CreateNewCompany);
		writeText(Cname,cname);
		click(Ctr);
		click(Type);
		Keys(Type);
		click(address);
		getSearch(address, Address);
		Keys(address);
		click(create);		
	}
	
	public void SearchAddress(String Address)
	{
		click(address);
		getSearch(address, Address);
	}
	public void ClickOnContractorType()
	{
		
	}
	
	public void EditCompany(String cname, String email, String phone, String address, String city, String state, String zipcode)
	{
		click(DefaultCompanybtn);
		click(editCompany);
		writeText(editName, cname);
		writeText(editEmail, email);
		writeText(editPhone, phone);
		writeText(editAdd, address);
		writeText(editCity, city);
		writeText(editState, state);
		writeText(editZip, zipcode);
		click(Update);					
	}
}
