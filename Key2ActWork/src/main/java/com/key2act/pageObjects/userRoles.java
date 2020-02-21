package com.key2act.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.IBLocators;

public class userRoles extends ActionClass implements IBLocators{
	
	public userRoles(WebDriver driver) {
		super(driver);

	}

    By ManageUsers = By.xpath(manageUsers);
    By InviteUsers = By.xpath(inviteUsers);
    By Email = By.xpath(email);
	
    By Roledrp = By.xpath(roledrp);
    By Roledropdown = By.xpath(roledropdown);
    By Create = By.xpath(create);
    By ManageRoles = By.xpath(manageRoles);
    By createrole = By.xpath(createRole);
    By rolename = By.xpath(Rolename);
    By roledes = By.xpath(Roledescription);
    By rolesave = By.xpath(Rolesave);
    By Editrole = By.xpath(editrole);
    By RoleEdit = By.xpath(roleEdit);
    By editwrite = By.xpath(Editwrite);
    By editread = By.xpath(Editread);
    By deletrole = By.xpath(Deletrole);
    By roledel = By.xpath(Roledel);
    By editrole1 = By.xpath(Editrole1);
    By editrolename = By.xpath(Editrolename);
    By editroledes = By.xpath(Editroledes);
    By editrolesave = By.xpath(Editrolesave);
    By Update = By.xpath(update);
	
	public void ManageUser(String email, String role)
	{
		click(ManageUsers);
		click(InviteUsers);
		writeText(Email, email);
		selectRole(role);
		click(Create);
	}
	
	public void ManageRole(String role, String description)
	{
		click(ManageRoles);
		click(createrole);
		writeText(rolename, role);
		writeText(roledes, description);
		click(rolesave);
	}
	
	public void EditRole(String roles, String name, String description)
	{
		click(ManageRoles);
		selectRoles(roles);
		click(RoleEdit);
		writeText(rolename,name);
		writeText(roledes, description);
		click(Update);		
	}
	
//	@FindBy(xpath="//span[text()='Manage Users']")
//	public WebElement ManageUsers;
//	
//	@FindBy(xpath="//button[text()='Invite Users']")
//	public WebElement InviteUsers;
//	
//	@FindBy(xpath="//input[@id='email']")
//	public WebElement Email;
	
//	@FindAll(@FindBy(xpath="//ul[@role='listbox']//li"))
//	public List<WebElement> Roledrp;
//	
//	@FindBy(xpath=//div[@id='select-role']")"
//	public WebElement Roledropdown;
//	
//	@FindBy(xpath="//span[text()='Create']")
//	public WebElement Create;
//	
//	//Roles
//	@FindBy (xpath="//span[text()='Manage Roles']")
//	public WebElement ManageRoles;
//	
//	@FindBy(xpath="//text()[.='New Role']/ancestor::button[1]")
//	public WebElement createrole;
//	
//	@FindBy(xpath="//input[@type='text'][@name='name']")
//	public WebElement rolename;
//	
//	@FindBy(xpath="//input[@type='text'][@name='description']")
//	public WebElement roledes;
//	
//	@FindBy (xpath="//span[text()='Create']")
//	public WebElement rolesave;
//	
//	@FindBy(xpath="//*[@id='select-role']")
//	public WebElement Editrole;
//	
//	@FindBy(xpath="//button[text()='Edit Role']")
//	public WebElement RoleEdit;
//	
//	@FindBy(xpath="//text()[.='read']/ancestor::li[1]")
//	public WebElement editwrite;
//	
//	@FindBy(xpath="//text()[.='read']/ancestor::li[1]")
//	public WebElement editread;
//	
//	@FindBy(xpath="(//button[@class='ActionBarItem_button__Dekv1'])[3]")
//	public WebElement  deletrole;
//	
//	@FindBy(xpath="//span[text()='Confirm']")
//	public WebElement roledel;
//	
//	@FindBy(xpath="//button[text()='Edit Role']")
//	public WebElement editrole1;
//	
//	@FindBy(xpath="//*[@id='name']")
//	public WebElement editrolename;
//	
//	@FindBy(xpath="//*[@id='description']")
//	public WebElement  editroledes;
//	
//	@FindBy(xpath="//*[@data-test-id='confirm']")
//	public WebElement editrolesave;
//	
//	@FindBy(xpath="//span[text()='Update']")
//	public WebElement Update;
	
	public void selectRole(String role)
	{
		click(Roledropdown);
		List<WebElement> roledrp = getElements(Roledrp);
		int count = roledrp.size();
		for(int i=0;i<count;i++)
		{
			String text = roledrp.get(i).getText();
			if(text.contains(role))  //"New Tester Role"
			{
				roledrp.get(i).click();
				break;
			}
		}
	}

	public void selectRoles(String roles)
	{
		click(Editrole);
		List<WebElement> editroledrp = getElements(Roledrp);
		int count = editroledrp.size();
		for(int i=0;i<count;i++)
		{
			String text = editroledrp.get(i).getText();
			if(text.contains(roles))
			{
				editroledrp.get(i).click();
				break;
			}
		}
	}
}
