/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author USER-4W55N52
 */
public class FlightBookingTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    
    public FlightBookingTest() {
    }
    
   
    
    @Before
    public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
   // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
  }
    
    
    @Test
    public void testFlightBooking(){
        driver.get("http://newtours.demoaut.com");
        By locator=By.name("userName");
        WebElement e=driver.findElement(locator);
        e.clear();
        e.sendKeys("mercury");
        //driver.findElement(By.name("userName"));
       // driver.findElement(By.name("userName")).clear();
       // driver.findElement(By.name("userName")).sendKeys("mercury");
        driver.findElement(By.name("password"));
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("mercury");
        driver.findElement(By.name("login")).click();
        
        locator=By.name("tripType");
        driver.findElements(locator).get(1).click();
        driver.findElement(By.partialLinkText("Vacations")).click();
    }
    
    @After
    public void tearDown() {
        
    }
    
}
