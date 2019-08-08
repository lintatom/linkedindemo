package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class Linkedin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @Test
  public void testLinkein() throws Exception {
    driver.get("https://www.linkedin.com/");
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.xpath("//div[@id='app__container']/main/div")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("lintatom777@gmail.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys("Marketing123$");
    driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
    driver.findElement(By.id("jobs-tab-icon")).click(); 
    Thread.sleep(5000);
    driver.findElement(By.xpath("artdeco-typeahead-deprecated-input__ghost-text")).sendKeys("QA");
    
   // driver.findElement(By.xpath("//*[@id=\"JOBS\"]/section[1]/input")).sendKeys("QA Analyst");   
    
   // driver.findElement(By.xpath("//div[@id=\"472\"]//input[@placeholder=\"Search jobs\"]")).sendKeys("QA");
//driver.findElement(By.xpath("//*[@id=\"jobs-search-box-keyword-id-ember472\"]")).sendKeys("QA Anlyst"); 
// driver.findElement(By.xpath("//div[@id=\"jobs-search-box-keyword-id-ember472\"]//input[@placeholder="Search jobs"]")).sendKeys("QA");
   





// driver.findElement(By.id("jobs-search-box-keyword-id-ember472")).clear();
   // driver.findElement(By.id("jobs-search-box-keyword-id-ember472")).sendKeys("QA Analyst");
    //driver.findElement(By.xpath("//*[@id=\"ember472\"]/button")).click();
  //driver.findElement(By.xpath(""))
  }

  @After
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
