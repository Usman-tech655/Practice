package com.key2act.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.IBLocators;

public class Masterpagefactory extends ActionClass implements IBLocators{
	
	public WebDriver driver;
	
	
	public Masterpagefactory(WebDriver driver)
	{
		super(driver);
	}
	
    By Company = By.xpath(company);
    By CName = By.xpath(cName);
    By ApplicationMenu = By.xpath(appmenu);
    // Menu Links
    By IOTHub = By.xpath(iotHub);
    By Home = By.xpath(home);
    By RuleBuilder = By.xpath(ruleBuilder);
    By Architect = By.xpath(architect);
    By MyAccount = By.xpath(myAccount);
    By DevPortal = By.xpath(devPortal);
	By Admin = By.xpath(admin);
	
	// Update Password
	By UpdatePassword = By.xpath(updatepassword);
	By password = By.xpath(Password);
	By newpassword = By.xpath(NewPassword);
	By cancel = By.xpath(Cancel);
	By update = By.xpath(Update);
	
    public void ClickOnAppMenu()
    {
    	click(ApplicationMenu);
    }
    public void ClickonAdmin()
    {
    	click(Admin);
    }
    
    
    // Menus Links
//    @FindBy(xpath="//a[text()='IoT Hub']")
//    public WebElement IOTHub;
//    
//    @FindBy(xpath="//a[text()='Home']")
//    public WebElement Home;
    
//    @FindBy(xpath="//a[text()='Rule Builder']")
//    public WebElement RuleBuilder;
//    
//    @FindBy(xpath="//a[text()='Architect']")
//    public WebElement Architect;
//    
//    @FindBy(xpath="//a[text()='My Account']")
//    public WebElement MyAccount;
//    
//    @FindBy(xpath="//a[text()='Dev Portal']")
//    public WebElement DevPortal;
	// 
    
//	@FindBy(xpath="//input[@name='email']")
//	public WebElement  Username;
//	
//	@FindBy(xpath="//*[@id='password']")
//	public WebElement  Password;
//	
//	@FindBy(xpath="//*[text()='Sign In']")
//	public WebElement  Login;
//	
//	@FindBy(xpath="//*[@class='jss201']")
//	public WebElement signtout;
//	
//	/*@FindBy(xpath="	(//button[@type='button'])[3]")
//	public WebElement Update;
//	
//	@FindBy(xpath="//*[@name='password']")
//	public WebElement change;*/
//	
//	@FindBy(xpath="//*[text()='Create Company']")
//	public String company;
//	
//	@FindBy(xpath="//*[@id='name']")
//	public  WebElement cname;
//	
//	@FindBy(xpath="//div[@id='root']/div/div/header/button/i")      //   // //*[@id='root']/div/header/button/i
//	public WebElement ApplicationMenu;
	
//	public void Wait()
//	{
//		wait.until(ExpectedConditions.visibilityOf(ApplicationMenu));
//	}
//    @FindBy(xpath="//a[text()='Admin']")
//    public WebElement Admin;
    
//    @FindBy(xpath="//span[text()='Manage Roles']")
//    public WebElement userrole;
//    
//    @FindBy(xpath="(//button[@class='ActionBarItem_button__Dekv1'])[1]")   // //text()[.='New Role']/ancestor::button[1]
//    public WebElement editrole;
//
//    @FindBy(xpath="//*[@id='name']")
//    public WebElement Billing;
//
//    @FindBy(xpath="//*[@id='email']")
//    public WebElement billingemail;
//
//    @FindBy(xpath="//*[@id='phone']")
//    public WebElement billingphone;
//
//    @FindBy(xpath="//*[@id='address1']")
//    public WebElement billingadd;
//
//    @FindBy(xpath="//*[@id='city']")
//    public WebElement billingcity;
//
//    @FindBy(xpath="//*[@id='state']")
//    public WebElement billingstate;
//
//    @FindBy(xpath="//*[@id='zip']")
//    public WebElement billingzip;
//
//    @FindBy(xpath="//span[text()='Save']")
//    public WebElement billingsave;
//    
//    // Update Password
//    @FindBy(xpath="//span[text()='Update Password']")
//    public WebElement Updatepassword;
//    
//    @FindBy(xpath="//input[@id='password']")
//    public WebElement password;
//    
//    @FindBy(xpath="//input[@id='newPassword']")
//    public WebElement newpassword;
//    
//    @FindBy(xpath="//span[text()='Cancel']")
//    public WebElement Cancel;
//    
//    @FindBy(xpath="//span[text()='Update']")
//    public WebElement Update;
    
   	
}
