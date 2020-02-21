package com.key2act.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.key2act.work.Actions.ActionClass;
import com.key2act.work.Actions.IBLocators;

public class IOTHub extends ActionClass implements IBLocators{
	
	public IOTHub(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By Iot = By.xpath(iotHub);
	By ManageBASAgents = By.xpath(manageBASAgents);
	By NewAgent = By.xpath(newAgent);
	By CreateAgent = By.xpath(createAgent);
	By Aserial = By.xpath(agentserial);	
	By TimeZone = By.xpath(timeZone);
	
	By Timezonedrp = By.xpath(timezonedrp);
	By Cancel = By.xpath(cancel);
	By ASave = By.xpath(agentSave);
	By assignA = By.xpath(AssignA);
	By AgentAssign = By.xpath(agentAssign);
	By ManageA = By.xpath(ManageAgent);
	By Forgot = By.xpath(forgot);
	
	
	public void CreateAgent(String agent, String serial, String Zone)
	{
		click(Iot);
		click(ManageBASAgents);
		click(NewAgent);
		click(CreateAgent);
		writeText(CreateAgent, agent);
		writeText(Aserial, serial);
		click(TimeZone);
		selectTimezone(Zone);
		click(ASave);		
	}
	public void AgAction(){
		click(Iot);
		click(ManageBASAgents);
		click(assignA);
		click(ManageA);
		
		
	}

//	@FindBy(xpath="//a[text()='IoT Hub']")
//	public WebElement iot;
	
//	@FindBy(xpath="//span[text()='Manage BAS Agents']")
//	public WebElement ManageBASAgents;
	
//	@FindBy(xpath="//button[text()='New Agent']")
//	public WebElement NewAgent;
	
//	@FindBy(xpath="//*[@id='name']")
//	public WebElement CreateAgent;	
//	@FindBy(xpath="//*[@id='serialNumber']")
//	public WebElement Aserial;	
//	@FindBy(xpath="//div[@id='select-timeZone']")
//	public WebElement TimeZone;
		
//	@FindAll(@FindBy(xpath="//ul[@role='listbox']//li"))
//	public List<WebElement> Timezonedrp;
	
//	@FindBy(xpath="//span[text()='Cancel']")
//	public WebElement Cancel;	
//	
//	@FindBy(xpath="//span[text()='Create']")
//	public WebElement ASave;
//	
//	@FindBy(xpath="(//*[@class='fas fa-ellipsis-h'])[16]")
//	public WebElement assignA;
//	
//	@FindBy(xpath="//text()[.='Assign Agent']/ancestor::li[1]")
//	public WebElement AgentAssign;
//	
//	@FindBy(xpath="//text()[.='Manage Agent']/ancestor::li[1]")
//	public WebElement ManageA;
//	
//	@FindBy(xpath="//button[text()='Forgot Password?']")
//	public WebElement forgot;
	
	
//	@FindBy(xpath="//li[text()='"+Country+"']")
//	public WebElement selectTimezone;
	
	
	public void selectTimezone(String Zone) {    
		List<WebElement> Timezonedp = getElements(Timezonedrp);
		int count =Timezonedp.size();
		for(int i=0;i<count;i++)
		{
			String text = Timezonedp.get(i).getText();
			if(text.contains(Zone))
			{
				scroll();
				scroll();
				Timezonedp.get(i).click();
				break;
			}
		}
	}
}
