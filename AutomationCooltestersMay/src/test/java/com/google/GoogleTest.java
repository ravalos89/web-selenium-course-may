package com.google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

  @BeforeTest
  public void beforeTest() {
	  	  
  }
  
  @Test
  public void tc001Google() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); 
	  
	  driver.get("https://www.google.com/");
	  
	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	  
	  WebDriverWait wait = new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.titleIs("Google"));
	  
	  driver.manage().window().maximize();
	  
	  driver.close();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
