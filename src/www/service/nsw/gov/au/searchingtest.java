package www.service.nsw.gov.au;

// Import package
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

public class searchingtest {
	
  // Declare web driver
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  
  // Initialization chrome driver
  ChromeOptions chromeOptions = new ChromeOptions();
  
  @Before
  public void setUp() throws MalformedURLException {
	
	// Set up chrome to run web test
	System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void testsearch() {
	  
	  // Search test for apply for a number plate
	  driver.get("https://www.service.nsw.gov.au/");
	  driver.manage().window().setSize(new Dimension(1296, 696));
	  
	  driver.findElement(By.name("q")).click();
	  driver.findElement(By.name("q")).sendKeys("apply for a number plate");
	  driver.findElement(By.cssSelector(".form--global-search-group .button")).click();
	  
	  // Delay 10 sec before load next page
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   {
	     WebElement element = driver.findElement(By.cssSelector(".button--xxlarge > svg"));
	     Actions builder = new Actions(driver);
	     builder.moveToElement(element).perform();
	   }
	   {
	     WebElement element = driver.findElement(By.tagName("body"));
	     Actions builder = new Actions(driver);
	     builder.moveToElement(element, 0, 0).perform();
	   }
	   
	   // Search test for find location by "Sydney 2000"
	   driver.findElement(By.linkText("Find locations")).click();
	   driver.findElement(By.id("locatorTextSearch")).click();
	   js.executeScript("window.scrollTo(0,677.3333129882812)");
	   driver.findElement(By.id("locatorTextSearch")).sendKeys("Sydney 2000");
	   driver.findElement(By.cssSelector(".button--xxlarge")).click();
	   js.executeScript("window.scrollTo(0,903.3333129882812)");
	   js.executeScript("window.scrollTo(0,1177.3333740234375)");
	   driver.findElement(By.linkText("Marrickville Service Centre")).click();
	   js.executeScript("window.scrollTo(0,91.33333587646484)");
	   {
	     WebElement element = driver.findElement(By.linkText("browse our services"));
	     Actions builder = new Actions(driver);
	     builder.moveToElement(element).perform();
	   }
	   {
	     WebElement element = driver.findElement(By.linkText("Plan ahead"));
	     Actions builder = new Actions(driver);
	     builder.moveToElement(element).perform();
	   }
  }
}
