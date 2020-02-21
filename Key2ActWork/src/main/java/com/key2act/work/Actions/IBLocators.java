package com.key2act.work.Actions;

import org.openqa.selenium.By;

public interface IBLocators {
	
	// Login Page locators
	String username = "//input[@name='email']";
	String password = "//*[@id='password']";
	String login  = "//*[text()='Sign In']";
	String MyAccounttext = "(//div[@class='Title_TitleBox__1nStG'])[1]";
	String signout = "//*[@class='jss201']";
	String appmenu ="(//i[text()='apps'])[1]";
	// Masterpage Lacotars
	String company ="//*[text()='Create Company']";
	
    String cName = "//*[@id='name']";
    String applicationMenu = "//div[@id='root']/div/div/header/button/i";
    // Menu Links
    String iotHub = "//a[text()='IoT Hub']";
    String home = "//a[text()='Home']";
    String ruleBuilder = "//a[text()='Rule Builder']";
    String architect = "//a[text()='Architect']";
    String myAccount = "//a[text()='My Account']";
    String devPortal = "//a[text()='Dev Portal']";
	String admin = "//a[text()='Admin']";
	
	// IOTHub Page locators

	String manageBASAgents = "//span[text()='Manage BAS Agents']";
	String newAgent = "//button[text()='New Agent']";
	String createAgent = "//*[@id='name']";
	String agentserial = "//*[@id='serialNumber']";	
	String timeZone = "//div[@id='select-timeZone']";	
	String timezonedrp = "//ul[@role='listbox']//li";
	String cancel = "//span[text()='Cancel']";
	String agentSave = "//span[text()='Create']";
	String AssignA = "(//*[@class='fas fa-ellipsis-h'])[19]";
	String agentAssign = "//text()[.='Assign Agent']/ancestor::li[1]";
	String ManageAgent = "//text()[.='Manage Agent']/ancestor::li[1]";
	String forgot = "//button[text()='Forgot Password?']";
	// User Roles page Locators
	String  manageUsers = "//span[text()='Manage Users']";
    String inviteUsers = "//button[text()='Invite Users']";
    String  email = "//input[@id='email']";
	
    String roledrp = "//ul[@role='listbox']//li";
    String roledropdown = "//div[@id='select-role']";
    String create = "//input[@id='email']";
    String manageRoles = "//span[text()='Manage Roles']";
    String createRole = "//input[@id='email']";
    String Rolename = "//input[@id='email']";
    String Roledescription = "//input[@id='email']";
    String Rolesave = "//input[@id='email']";
    String editrole = "//input[@id='email']";
    String roleEdit = "//input[@id='email']";
    String Editwrite = "//input[@id='email']";
    String Editread = "//input[@id='email']";
    String Deletrole = "//input[@id='email']";
    String Roledel = "//input[@id='email']";
    String Editrole1 = "//input[@id='email']";
    String Editrolename = "//input[@id='email']";
    String Editroledes = "//input[@id='email']";
    String Editrolesave = "//input[@id='email']";
    String update = "//input[@id='email']";
    // Update Password
    String updatepassword ="//span[text()='Update Password']";
    String Password = "//input[@id='password']";
    String NewPassword="//input[@id='newPassword']";
    String Cancel ="//span[text()='Cancel']";
    String Update ="//span[text()='Update']";
    
    // Company details Page
    //String company ="//*[text()='Create Company']";
	String defaultCompanybtn = "(//button[@type='button'])[2]";
	String createNewCompany = "(//li[@role='menuitem'])[2]";
	String edit_Company = "(//li[@role='menuitem'])[1]";
	String change = "(//button[@type='button'])[3]";
	String updatepswd = "//*[@id='password']";
	String newPassword = "//*[@id='newPassword']";
	String create1 = "//*[text()='Update']";
	String cname= "//*[@id='name']";
	String ctr=  "//*[@id='select-contractorName']";
	String type = "//text()[.='Mechanical Service Provider – Commercial']/ancestor::li[1]";
	String type2= "//text()[.='Mechanical Service Provider – Residential']/ancestor::li[1]";
	String type3= "//text()[.='Building Automation']/ancestor::li[1]";
	String type4= "//text()[.='Energy Services']/ancestor::li[1]";
	String Address = "//*[@id='addressSearch']";
	String Address1 = "//input[@id='address1']";
	String City = "//input[@id='city']";
	String Zipcode = "//*[@id='zip']";
	String C_cancel = "//span[text()='Cancel']";
	String Create  = "//span[text()='Create']";
	String EditCompany =  "//*[text()='Edit Billing Information']";
	String EditName = "//*[@id='name']";
	String EditEmail = "//*[@id='email']";
	String EditPhone = "//*[@id='phone']";
	String EditAdd = "//*[@id='address1']";
	String EditCity = "//*[@id='city']";
	String EditState = "//*[@id='state']";
	String EditZip = "//*[@id='zip']";


}
