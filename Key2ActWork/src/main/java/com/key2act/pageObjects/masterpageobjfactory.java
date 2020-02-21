package com.key2act.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class masterpageobjfactory {
	
	WebDriver driver;
	WebDriverWait wait;

	public masterpageobjfactory(WebDriver driver){
	this.driver = driver;
	PageFactory.initElements(driver, this);
	wait = new WebDriverWait(driver, 20);

	}

	@FindBy(xpath="//*[@id='email']")
	private List<WebElement> email;
	@FindBy(xpath="//*[@id='password']")
	private List<WebElement> pass;
	//@FindBy(xpath="//*[@class='AuthCore_buttonContainer__p3GQ0\']")
	@FindBy(xpath="//span[text()='Sign In']")
	private List <WebElement> singin;
	@FindBy(xpath="//*[@id='password']")
	private List <WebElement>singuppass;
	@FindBy(xpath="//span[text()='Sign Up']")
	private List<WebElement>signup;
	@FindBy(xpath="//*[@id='firstName']")
	private List<WebElement> signupfirst;
	@FindBy(xpath="//*[@id='lastName']")
	private List <WebElement> signuplast;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>emailsignup;
	@FindBy(xpath="//*[@id='phone']")
	List <WebElement> signuphone;
	@FindBy(xpath="//*[@id='confirmPassword']")
	private List <WebElement> signupconfirm;
	@FindBy(xpath="//span[text()='Sign Up']")
	private List <WebElement> hitsignup;
	@FindBy(xpath="//*[text()='Create Company']")
	private List<WebElement>company;
	@FindBy(xpath="(//button[@type='button'])[3]")
	private List <WebElement> change;
	@FindBy(xpath="//*[@id='password']")
	private List <WebElement>update;
	@FindBy(xpath="//*[@id='newPassword']")
	private List <WebElement>newpass;
	@FindBy(xpath="//*[text()='Update']")
	private List<WebElement>create1;
	//@FindBy(xpath="//*[@id='name']")
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> cname;
	@FindBy(xpath="//*[@id='select-contractorName']")
	public List<WebElement>ctr;
	@FindBy(xpath="//text()[.='Mechanical Service Provider – Commercial']/ancestor::li[1]")
	private List<WebElement>type;
	@FindBy(xpath="//*[@id='addressSearch']")
	private List<WebElement>address;
	@FindBy(xpath="//span[text()='Create']")
	private List<WebElement>create;
	//@FindBy(xpath="//*[@id='root']/div/header/button/i")
	@FindBy(xpath="(//i[text()='apps'])[1]")
	private List <WebElement> Menu;
	@FindBy(xpath="//a[text()='Home']")
	private List<WebElement>Home;
	@FindBy(xpath="//a[text()='Admin']")
	private List<WebElement>Admin;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement>Billing;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>billingemail;
	@FindBy(xpath="//*[@id='phone']")
	private List<WebElement>billingphone;
	@FindBy(xpath="//*[@id='address1']")
	private List<WebElement>billingadd;
	@FindBy(xpath="//*[@id='city']")
	private List<WebElement>billingcity;
	@FindBy(xpath="//*[@id='state']")
	private List<WebElement>billingstate;
	@FindBy(xpath="//*[@id='zip']")
	private List<WebElement>billingzip;
	@FindBy(xpath="//span[text()='Save']")
	private List <WebElement>billingsave;
	@FindBy(xpath="(//button[@type= 'button'])[1]")
	private List <WebElement> drop;
	@FindBy (xpath="//*[text()='Edit Billing Information']")
	private List <WebElement>editcompany;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> editname;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>editemail;
	@FindBy(xpath="//*[@id='phone']")
	private List<WebElement>editphone;
	@FindBy(xpath="//*[@id='address1']")
	public List<WebElement>editadd;
	@FindBy(xpath="//*[@id='city']")
	private List<WebElement>editcity;
	@FindBy(xpath="//*[@id='state']")
	public List<WebElement> editstate;
	@FindBy(xpath="//*[@id='zip']")
	public List<WebElement> editzip;
	@FindBy(xpath="//button[@type='submit']")
	private List<WebElement> editsave;
	
	@FindBy (xpath="//span[text()='Manage Roles']")
	private List<WebElement> userole;
	@FindBy(xpath="//text()[.='New Role']/ancestor::button[1]")
	private List<WebElement> createrole;
	@FindBy(xpath="//input[@type='text'][@name='name']")
	private List <WebElement> rolename;
	@FindBy(xpath="//input[@type='text'][@name='description']")
	private List <WebElement> roledes;
	@FindBy (xpath="//span[text()='Create']")
	private List<WebElement>rolesave;
	@FindBy(xpath="//*[@id='select-role']")
	private List <WebElement>editrole;
	@FindBy(xpath="//text()[.='read']/ancestor::li[1]")
	private List<WebElement> editwrite;
	@FindBy(xpath="//text()[.='read']/ancestor::li[1]")
	private List<WebElement>editread;
	@FindBy(xpath="(//button[@class='ActionBarItem_button__Dekv1'])[3]")
	private List <WebElement>deletrole;
	@FindBy(xpath="//span[text()='Confirm']")
	private List <WebElement> roledel;
	@FindBy(xpath="//button[text()='Edit Role']")
	private List<WebElement>editrole1;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> editrolename;
	@FindBy(xpath="//*[@id='description']")
	private List <WebElement>editroledes;
	@FindBy(xpath="//*[@data-test-id='confirm']")
	private List<WebElement>editrolesave;
	@FindBy(xpath="//*[@class='fas fa-caret-down']")  
	public List<WebElement> editcompanyy;
	@FindBy(xpath="(/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/div[1]/li[1]")//li[@role='menuitem'])[1]
	private List<WebElement> editjcompany;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement>editjcompanyname;
	@FindBy(xpath="//*[@id='addressSearch']")
	private List<WebElement> editjadd;
	@FindBy(xpath="//span[text()='Edit']")
	private List <WebElement> editjsave;
	@FindBy(xpath="//span[text()='Manage Users']")
	private List <WebElement>manageuser;
	@FindBy(xpath="//text()[.='Invite Users']/ancestor::button[1]")
	private List <WebElement>inviteuser;
	@FindBy(xpath="//*[@id='email']")
	private List <WebElement> inviteemail;
	@FindBy(xpath="(//text()[.='']/ancestor::div[1])[2]")
	private List <WebElement>inviterole;
	@FindBy(xpath="//text()[.='Read Only']/ancestor::li[1]")
	private List <WebElement>roleselect;
	@FindBy(xpath="//span[text()='Create']")
	private List<WebElement>createuser;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/main[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[16]/td[4]/button[1]/span[1]/i[1]")
	private List<WebElement>managerol;
	@FindBy(xpath="//text()[.='Manage User']/ancestor::li[1]")
	private List <WebElement>rolechange;
	@FindBy(xpath="//div[text()='Read Only']")
	private List <WebElement>manageuserole;
	@FindBy (xpath="//text()[.='Admin']/ancestor::li[1]")
	private List <WebElement>unewrole;
	@FindBy(xpath="//span[text()='Save']")
	private List<WebElement>newrolesave;
	@FindBy(xpath="//text()[.='Remove User']/ancestor::li[1]")
	private List<WebElement>removeuser;
	@FindBy(xpath="//a[text()='IoT Hub']")
	private List<WebElement>iot;
	@FindBy(xpath="//span[text()='Manage BAS Agents']")
	private List <WebElement>iot1;
	@FindBy(xpath="//button[text()='New Agent']")
	private List<WebElement> IotNA;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> CreateAgent;
	@FindBy(xpath="//*[@id='serialNumber']")
	private List<WebElement>Aserial;
	@FindBy(xpath="//span[text()='Create']")
	private List<WebElement>ASave;
	@FindBy(xpath="(//*[@class='fas fa-ellipsis-h'])[16]")
	private List<WebElement>assignA;
	@FindBy(xpath="//text()[.='Assign Agent']/ancestor::li[1]")
	private List<WebElement>AgentAssign;
	@FindBy(xpath="//text()[.='Manage Agent']/ancestor::li[1]")
	private List <WebElement>ManageA;
	@FindBy(xpath="//button[text()='Forgot Password?']")
	private List<WebElement>forgot;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>frgtemail;
	@FindBy(xpath="//span[text()='Reset Password']")
	private List<WebElement>frgtreset;
	@FindBy(xpath="//*[text()='Sign Out']")
	private List<WebElement>signout;
	public void Wait() {
	wait.until(ExpectedConditions.visibilityOf((WebElement) Menu));


	}
	public void waite() {
	wait.until(ExpectedConditions.elementToBeClickable((WebElement) billingsave));
	}








	//Getter



	public List<WebElement> getSignout() {
	return signout;
	}
	public List<WebElement> getEmailsignup() {
	return emailsignup;
	}


	public List<WebElement> getSignupfirst() {
	return signupfirst;
	}

	public List<WebElement> getSignuplast() {
	return signuplast;
	}
	public List<WebElement> getSignup() {
	return signup;
	}
	public List<WebElement> getEmail() {
	return email;
	}


	public List<WebElement> getSignuphone() {
	return signuphone;
	}

	public List<WebElement> getSinguppass() {
	return singuppass;
	}

	public List<WebElement> getSignupconfirm() {
	return signupconfirm;
	}
	public List<WebElement> getPass() {
	return pass;
	}


	public List<WebElement> getHitsignup() {
	return hitsignup;
	}
	public List<WebElement> getSingin() {
	return singin;
	}


	public List<WebElement> getChange() {
	return change;
	}

	public List<WebElement> getUpdate() {
	return update;
	}

	public List<WebElement> getNewpass() {
	return newpass;
	}

	public List<WebElement> getCreate1() {
	return create1;
	}

	public List<WebElement> getCompany() {
	return company;
	}


	public List<WebElement> getCname() {
	return cname;
	}

	public List<WebElement> getContractor() {
	return ctr;
	}

	public List<WebElement> getAddress() {
	return address;
	}

	public List<WebElement> getType() {
	return type;
	}

	public List<WebElement> getCreate() {
	return create;
	}

	public List<WebElement> getMenu() {
	return Menu;
	}

	public List<WebElement> getDrop() {
	return drop;
	}


	public List<WebElement> getHome() {
	return Home;
	}
	public List<WebElement> getAdmin() {
	return Admin;
	}

	public List<WebElement> getBilling() {
	return Billing;
	}


	public List<WebElement> getBillingemail() {
	return billingemail;
	}

	public List<WebElement> getBillingphone() {
	return billingphone;
	}

	public List<WebElement> getBillingadd() {
	return billingadd;
	}


	public List<WebElement> getCity() {
	return billingcity;
	}

	public List<WebElement> getBillingstate() {
	return billingstate;
	}


	public List<WebElement> getBillingzip() {
	return billingzip;
	}

	public List<WebElement> getBillingsave() {
	return billingsave;
	}
	public List<WebElement> getEditcompany() {
	return editcompany;
	}
	public List<WebElement> getEditname() {
	return editname;
	}
	public List<WebElement> getEditemail() {
	return editemail;
	}
	public List<WebElement> getEditphone() {
	return editphone;
	}
	public List<WebElement> getEditadd() {
	return editadd;
	}
	public List<WebElement> getEditcity() {
	return editcity;
	}
	public List<WebElement> getEditstate() {
	return editstate;
	}
	public List<WebElement> getEditzip() {
	return editzip;
	}
	public List<WebElement> getEditsave() {
	return editsave;
	}
	public List<WebElement> getUserole() {
	return userole;
	}
	public List<WebElement> getCreaterole() {
	return createrole;
	}
	public List<WebElement> getRolename() {
	return rolename;
	}
	public WebDriver getDriver() {
	return driver;
	}
	public List<WebElement> getRoledes() {
	return roledes;
	}
	public List<WebElement> getRolesave() {
	return rolesave;
	}
	public List<WebElement> getEditrole() {
	return editrole;
	}
	public List<WebElement> getEditwrite() {
	return editwrite;
	}
	public List<WebElement> getEditrole1() {
	return editrole1;
	}
	public List<WebElement> getEditrolename() {
	return editrolename;
	}
	public List<WebElement> getEditroledes() {
	return editroledes;
	}
	public List<WebElement> getEditrolesave() {
	return editrolesave;
	}
	public List<WebElement> getEditcompanyy() {
	return editcompanyy;
	}
	public List<WebElement> getEditjcompany() {
	return editjcompany;
	}
	public List<WebElement> getEditjcompanyname() {
	return editjcompanyname;
	}
	public List<WebElement> getEditjadd() {
	return editjadd;
	}
	public List<WebElement> getEditjsave() {
	return editjsave;
	}
	public List<WebElement> getEditread() {
	return editread;
	}
	public List<WebElement> getDeletrole() {
	return deletrole;
	}
	public List<WebElement> getRoledel() {
	return roledel;
	}
	public List<WebElement> getManageuser() {
	return manageuser;
	}
	public List<WebElement> getInviteuser() {
	return inviteuser;
	}
	public List<WebElement> getInviteemail() {
	return inviteemail;
	}
	public List<WebElement> getInviterole() {
	return inviterole;
	}
	public List<WebElement> getRoleselect() {
	return roleselect;
	}
	public List<WebElement> getCreateuser() {
	return createuser;
	}
	public List<WebElement> getManagerol() {
	return managerol;
	}
	public List<WebElement> getRolechange() {
	return rolechange;
	}
	public List<WebElement> getManageuserole() {
	return manageuserole;
	}
	public List<WebElement> getUnewrole() {
	return unewrole;
	}
	public List<WebElement> getNewrolesave() {
	return newrolesave;
	}
	public List<WebElement> getRemoveuser() {
	return removeuser;
	}
	public List<WebElement> getIot() {
	return iot;
	}
	public List<WebElement> getIot1() {
	return iot1;
	}
	public List<WebElement> getIotNA() {
	return IotNA;
	}
	public List<WebElement> getCtr() {
	return ctr;
	}
	public List<WebElement> getCreateAgent() {
	return CreateAgent;
	}
	public List<WebElement> getAserial() {
	return Aserial;
	}
	public List<WebElement> getASave() {
	return ASave;
	}

	public List<WebElement> getAgentAssign() {
	return AgentAssign;
	}
	public List<WebElement> getAssignA() {
	return assignA;
	}
	public List<WebElement> getForgot() {
	return forgot;
	}
	public List<WebElement> getFrgtemail() {
	return frgtemail;
	}
	public List<WebElement> getFrgtreset() {
	return frgtreset;
	}
	public List<WebElement> getManageA() {
	return ManageA;
	}

}
