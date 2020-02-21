package com.key2act.pageObjects;



	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class JAbbotCompany {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testJAbbotCompany() throws Exception {
	    driver.get("https://esms.key2act.work/signin");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("usmankarim28@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Osmanch!234");
	    driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Osman!234");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign Up'])[1]/following::span[2]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Usman karim'])[1]/preceding::i[1]")).click();
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[3]/div/div/div/button/span/i")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('Jabbot', \"'\", 's Company')])[2]/following::li[1]")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("usmankarim28@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("Osman!234");
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div/div[2]/form/div[3]/button[2]/span")).click();
	    driver.findElement(By.xpath("//div[@id='root']/div/div/header/button/i")).click();
	    driver.findElement(By.linkText("Architect")).click();
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[3]/div/div/div/div[2]/div/ul/li[12]/span")).click();
	    driver.findElement(By.xpath("//div[@id='root']/div/div/div[2]/div[3]/div/div[2]/div[2]/div/div[2]/button[5]/span")).click();
	    driver.findElement(By.id("select-fuelTypes")).click();
	    driver.findElement(By.xpath("//div[@id='menu-fuelTypes']/div[2]/ul/li[5]/span[2]")).click();
	    driver.findElement(By.xpath("//div[@id='menu-fuelTypes']/div")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}



