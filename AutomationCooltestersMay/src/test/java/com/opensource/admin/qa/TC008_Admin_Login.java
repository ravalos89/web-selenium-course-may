package com.opensource.admin.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC008_Admin_Login {
  @Test
  public void TC008_Admin_Login_Script() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver2.exe");
		WebDriver driver = new ChromeDriver();

		// Step 1 - Open Browser "OrangeHRM" web page
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		
		driver.close();
		
		Assert.assertEquals("1","2");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
