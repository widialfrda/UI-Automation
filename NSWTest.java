// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestsearchTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void testsearch() {
    driver.get("https://www.service.nsw.gov.au/");
    driver.manage().window().setSize(new Dimension(1296, 696));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("apply for a number plate");
    driver.findElement(By.cssSelector(".form--global-search-group svg")).click();
    driver.findElement(By.linkText("Apply to exchange existing number plates between vehicles")).click();
    driver.findElement(By.linkText("Find locations")).click();
    js.executeScript("window.scrollTo(0,11.333333015441895)");
    driver.findElement(By.id("locatorTextSearch")).click();
    driver.findElement(By.id("locatorTextSearch")).sendKeys("Sydney 2000");
    driver.findElement(By.cssSelector(".button--xxlarge")).click();
    driver.findElement(By.linkText("Marrickville Service Centre")).click();
  }
}