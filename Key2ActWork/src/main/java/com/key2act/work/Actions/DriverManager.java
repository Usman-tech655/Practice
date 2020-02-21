package com.key2act.work.Actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import com.key2act.Utility.PropertyReader;



public class DriverManager {
	
	protected static WebDriver driver;
	public static Properties prop;

	public static WebDriver getDriver() throws IOException
	{	
	prop= new Properties();
	FileInputStream fis=new FileInputStream("src/main/resources/config.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/WebDrivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 //execute in chrome driver	
	}
	else if (browserName.equals("Edge"))
	{
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"/WebDrivers/MicrosoftWebDriver.exe");
		 driver= new EdgeDriver();
		//firefox code
	}
	else if (browserName.equals("ie"))
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/WebDrivers/IEDriverServer.exe");
	    driver = new InternetExplorerDriver();
	}
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return driver;
	}
	
	//For testing
	public static void main(String[] args) throws IOException {
		DriverManager.getDriver().get("https://accounttemplate.officesolver.com");
	}

}
