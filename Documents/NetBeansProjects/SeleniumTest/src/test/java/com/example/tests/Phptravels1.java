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

public class Phptravels1 {
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
    driver.manage().window().maximize();
  }

  @Test
/*  public void testPhptravels1() throws Exception {
    driver.get("https://www.phptravels.net/");
   // driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.name("checkin")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='May 2019'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[9]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[2]/following::td[12]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Child'])[1]/following::button[3]")).click();
   // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ريال'])[4]/following::button[1]")).click();
   // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='ريال'])[3]/following::div[3]")).click();
   driver.findElement(By.partialLinkText("Rendezvous Hotels")).click();
   
    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
    //driver.findElement(by)
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check in'])[2]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='May 2019'])[2]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[2]/following::td[9]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Check out'])[2]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[4]/following::td[12]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wake-up calls'])[3]/following::button[1]")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys("smith");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys("jack");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("smith@abc.com");
    driver.findElement(By.name("confirmemail")).click();
    driver.findElement(By.name("confirmemail")).clear();
    driver.findElement(By.name("confirmemail")).sendKeys("smith@abc.com");
    driver.findElement(By.name("phone")).click();
    driver.findElement(By.name("phone")).clear();
    driver.findElement(By.name("phone")).sendKeys("12456789");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("willa park");
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.name("guest")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Unpaid'])[1]/following::td[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due Date'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due Date'])[1]/following::div[1]")).click();
    assertEquals("Invoice", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Due Date'])[1]/following::div[1]")).getText());
  }*/
   public void testPhptravels1() throws Exception {
   driver.get("https://www.phptravels.net/");
      WebElement e= driver.findElement(By.id("round"));
      System.out.println(e.getAttribute("type"));
      e.click();
      driver.findElement(By.xpath("//ins[class='iCheck-helper'][2]"));
   }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
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
