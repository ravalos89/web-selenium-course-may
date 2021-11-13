package com.opensource.admin.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC001_Admin_SearchEmployee {

	@BeforeTest
	public void beforeTest() {
	}

	@Test
	public void TC001_Admin_SearchEmployee_Script() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Step 1 - Open Browser "OrangeHRM" web page
		Reporter.log("Open Browser \"OrangeHRM\" web page");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 2 - Enter Username and Password
		Reporter.log("Enter Username and Password");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	  driver.findElement(By.name("txtUsername"));	  
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 3 - Validate that you have logged in successfully
		Reporter.log("Validate that you have logged in successfully");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]")));

		// Step -4 Click Admin - Go to the admin page
		Reporter.log("Click Admin - Go to the admin page");
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='searchSystemUser_userName']")));

		// Step 5 - Search username in field "Username"
		Reporter.log("Search username in field 'Username'");
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("Admin");

		// Step 6 - Click Search
		Reporter.log("Click Search");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 7 - Verify username exist in table
		Reporter.log("Verify username exist in table");
		String username = driver.findElement(By.xpath("//tbody/tr[1]/td[2]")).getText();
//		Assert.assertEquals(username, "Admin");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(username, "Admin");
		
		//Step 8 - Log out
		Reporter.log("Log out");
		driver.findElement(By.xpath("//a[@id=\"welcome\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		//Step 9 Close Browser
		Reporter.log("Close Browser");
		driver.close();
		
		softAssert.assertAll();
		

	}

	@AfterTest
	public void afterTest() {

	}

}
