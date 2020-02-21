package com.key2act.work.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.key2act.Utility.PropertyReader;
import com.key2act.Utility.Screenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {
	
	public static Logger logger = LogManager.getLogger(ActionClass.class.getName());
	public WebDriver driver;
	public WebDriverWait wait;
	public Select select;
	public Actions actions;
	public Alert alert;
	static final int TIMEOUT = 40;
	static final int POLLING = 100;
	public static String  testName;
	public static String  title;
		
	PropertyReader pr = new PropertyReader();
	Screenshot screenhsot;
	// Constructor
	public ActionClass(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, TIMEOUT, POLLING);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
	}	
	// Wait for element to appear
	public void waitForElementToAppear(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
		highLightElement(elementBy);
	}
	// Wait for element to be clickable
	public void waitForElementToClick(By elementBy) {
		wait.until(ExpectedConditions.elementToBeClickable(elementBy));
		highLightElement(elementBy);
	}
	// Wait for alert to appear
	public void waitForAlertToAppear() {
		alert = wait.until(ExpectedConditions.alertIsPresent());
		if (alert != null) {
			isAlertPresent();
		}
	}
	public boolean isElementPresent(By elementBy) {

		try {
			if (driver.findElements(elementBy).size()>0) {
				return true;
			} else {
				return false;
			}
		}catch (NoSuchElementException ex){
			return  false;
		}
	}
	// Highlight Element
	public void highLightElement(By elementBy)  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border: 4px solid red;');", driver.findElement(elementBy));
		sleepTime(3);
		Screenshot.captureScreen(driver, title, testName);
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", driver.findElement(elementBy), "");
	}
	// Check alert present
	public boolean isAlertPresent() {
		boolean presentFlag = false;
		try {
			alert = driver.switchTo().alert();
			presentFlag = true;
			alert.accept();
		} catch (NoAlertPresentException ex) {
			ex.printStackTrace();
		}
		return presentFlag;
	}

	// click
	public void click(By elementBy) {
		waitForElementToClick(elementBy);		
		driver.findElement(elementBy).click();
	}

	//clear
	public void clear(By elementBy) {
		waitForElementToClick(elementBy);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value = '';", driver.findElement(elementBy));
	}
	// Double click
	public void doubleClick(By elementBy) {
		waitForElementToClick(elementBy);
		actions = new Actions(driver);
		actions.doubleClick(driver.findElement(elementBy)).perform();
	}
	// Write text
	public void writeText(By elementBy, String text) {
		waitForElementToAppear(elementBy);
		driver.findElement(elementBy).clear();
		driver.findElement(elementBy).sendKeys(text);
	}
	// Read text
	public String readText(By elementBy) {
		waitForElementToAppear(elementBy);
		return driver.findElement(elementBy).getText();
	}

	// Get element
	public WebElement getElement(By elementBy) {
		waitForElementToAppear(elementBy);
		return driver.findElement(elementBy);
	}
	// Get elements
	public List<WebElement> getElements(By elementBy) {
		waitForElementToAppear(elementBy);
		return driver.findElements(elementBy);
	}
	public void keysEnter(By elementBy) {
		waitForElementToClick(elementBy);
		driver.findElement(elementBy).sendKeys(Keys.ENTER);
	}
	public void Keys(By elementBy)
	{
		driver.findElement(elementBy).sendKeys(Keys.TAB);
	}
    public WebElement getSearch(By elementBy, String text)
    {
    	waitForElementToAppear(elementBy);
		driver.findElement(elementBy).sendKeys(text);
		logger.info("Enter the Data in Search textbox:"+elementBy);
		sleepTime(3);
		driver.findElement(elementBy).sendKeys(Keys.DOWN);
		logger.info("Selecting Item to down:"+elementBy);
		driver.findElement(elementBy).sendKeys(Keys.ENTER);
		logger.info("Select Item is Enter:"+elementBy);
		return driver.findElement(elementBy);
    }
	public void multiSelectByText(By elementBy,String xPathValue) {
		waitForElementToAppear(elementBy);
		int size=driver.findElements(By.xpath(xPathValue)).size();
		System.out.println(size +" mapsets found");
		boolean element=isElementPresent(By.xpath(xPathValue));
		if(element==true){
		driver.findElement(By.xpath("("+xPathValue+")["+size+"]")).click();}
		else{

		}
		System.out.println("changes are made to the most recent  mapset");
	}
	// Select by visible text
	public void selectByVisibleText(By elementBy, String value) {
		//waitForElementToAppear(elementBy);
		select = new Select(driver.findElement(elementBy));
		select.selectByVisibleText(value);
	}

	// Select by value
	public void selectByValue(By elementBy, String value) {
		waitForElementToAppear(elementBy);
		select = new Select(driver.findElement(elementBy));
		select.selectByValue(value);
	}

	// Get select value
	public String getSelectedValue(By elementBy) {
		waitForElementToAppear(elementBy);
		Select select = new Select(driver.findElement(elementBy));
		return select.getFirstSelectedOption().getText();
	}

	// Element to be click from the list
	public void elementTobeClickFromList(By elementBy, String value) 
	{
		highLightElement(elementBy);
		List<WebElement> checkBoxes = getElements(elementBy);
		for (WebElement boxes : checkBoxes) {
			String textValues = boxes.getText();
			if (textValues.contains(value)) {
				
				boxes.click();
				break;
			} else
				throw new RuntimeException(value + " is not available in the list");
		}
	}

	// JavaScript click
	public void javaScriptClick(By elementBy) {
		highLightElement(elementBy);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(elementBy));
	}

	// Scroll into view
	public void scrollIntoView(By elementBy) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(elementBy));
	}

	// Scroll page
	public void scroll() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)", "");
	}

	// Thread wait
	public void sleepTime(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Wait for page ro load
	public void waitForPageToLoad() {
		sleepTime(1);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String state = (String) js.executeScript("return document.readyState");
		while (!state.equals("complete")) {
			sleepTime(20);
			state = (String) js.executeScript("return document.readyState");
		}
	}

	// Convert date
	public String convertDate(String inputdate) {
		System.out.println("input date" + inputdate);
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date date = null;
		try {
			System.out.println("input date in concert date****" + inputdate);
			date = new SimpleDateFormat("MM/dd/yyyy").parse(inputdate);
			System.out.println("Date in concert date****" + date);
		} catch (Exception e) {
			e.getMessage();
		}
		return df.format(date);

	}

	public void maximizeBrowser(){
		driver.manage().window().maximize();

	}
	// Get Screenshot
	public void takeScreenShot() {
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		// String filePath = CRConstants.REPORTS_PATH + "screenshots//"
		// +//screenshotFile;
		String filePath = "";
		// store screenshot in that file
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileHandler.copy(scrFile, new File(filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public WebDriver getDriver(){
		return driver;
	}
}
