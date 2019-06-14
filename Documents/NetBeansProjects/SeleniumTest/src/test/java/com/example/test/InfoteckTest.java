/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.test;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
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
public class InfoteckTest {
     private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

    
    public InfoteckTest() {
    }
    
    @Before
   public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver","c:\\qa\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    String baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
   // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
  }
   @Test
   public void testInfoteck(){
       
       driver.get("https://www.itexps.net/applyforjob");
       driver.switchTo().frame("if6x91cn");
       driver.findElement(By.id("id123-control14653947-1"));
        driver.findElement(By.id("id123-control14653947-1")).clear();
        driver.findElement(By.id("id123-control14653947-1")).sendKeys("Tom");
        
        driver.findElement(By.id("id123-control14653949")).sendKeys("QA");
        driver.findElement(By.id("id123-control14653951_1")).click();
        WebElement e=driver.findElement(By.id("id123-control14653951_1"));
        
        System.out.println(e.getAttribute("style"));
        System.out.println(e.getAttribute("title"));
        if(e.getAttribute("checked")==null)
        {
            e.click();
        }
     /*  // By locator=By.id("id123-control14653947-1");
        //WebElement e=driver.findElement(locator);
       // e.clear();
       // e.sendKeys("Linta");
        //lastname
        driver.findElement(By.id("id123-control39309121-2"));
        driver.findElement(By.id("id123-control39309121-2")).clear();
        driver.findElement(By.id("id123-control39309121-2")).sendKeys("Tom");
        //email
        driver.findElement(By.id("id123-control39309122"));
        driver.findElement(By.id("id123-control39309122")).clear();
        driver.findElement(By.id("id123-control39309122")).sendKeys("lintmaria88@yahoo.co.in");*/
        
   }
    
    @After
    public void tearDown() {
    }
    
}
