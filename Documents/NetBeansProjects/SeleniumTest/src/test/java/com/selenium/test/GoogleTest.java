/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.test;


import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GoogleTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
      System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIndeedJobSearch() throws Exception {
    driver.get("https://www.indeed.com/");
    driver.findElement(By.id("text-input-what")).clear();
    driver.findElement(By.id("text-input-what")).sendKeys("selenium");
    driver.findElement(By.id("text-input-where")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign in'])[1]/following::form[1]")).click();
    driver.findElement(By.id("text-input-where")).clear();
    driver.findElement(By.id("text-input-where")).sendKeys("Chicago");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='city, state, or zip code'])[1]/following::div[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Find Jobs'])[2]/following::div[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Find Jobs'])[2]/following::div[2] | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=1 | ]]
    driver.findElement(By.cssSelector("svg.Bz112c-E3DyYd")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='city, state, or zip code'])[1]/following::button[1]")).click();
    driver.findElement(By.id("sja0")).click();
    driver.findElement(By.id("text-input-what")).clear();
    driver.findElement(By.id("text-input-what")).sendKeys("selenium");
    driver.findElement(By.id("text-input-where")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("text-input-what")).clear();
    driver.findElement(By.id("text-input-what")).sendKeys("selenium");
    driver.findElement(By.id("popover-close-link")).click();
    driver.findElement(By.id("sja0")).click();
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
