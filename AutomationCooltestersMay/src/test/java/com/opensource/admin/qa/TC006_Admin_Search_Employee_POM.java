package com.opensource.admin.qa;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.admin.UserManagementPage;
import com.opensource.base.GlobalVariables;
import com.opensource.base.SeleniumWrapper;
import com.opensource.login.LoginPage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC006_Admin_Search_Employee_POM {
	WebDriver driver;
	SeleniumWrapper seleniumWrapper;
	LoginPage login;
	UserManagementPage um;
	String username, password;
	ExtentReports reports;
	ExtentTest extentTest;

  @BeforeTest
  public void beforeTest() {
	  seleniumWrapper = new SeleniumWrapper(driver);
	  driver = seleniumWrapper.chromeDriverConnection();
	  login = new LoginPage(driver);
	  um = new UserManagementPage(driver);
	  
	  //SETUP DATA
	  
//	  JSON
//	  this.username = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "username");
//	  this.password = seleniumWrapper.getJSONValue(this.getClass().getSimpleName(), "password");
	  
//	  EXCEL
	  this.username = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 0);
	  this.password = seleniumWrapper.getCellData(this.getClass().getSimpleName(), 1, 1);
	  
	  // Reports
//	  reports = new ExtentReports("C:\\Users\\ravalos\\git\\web-selenium-course-may\\"
//	  		+ "AutomationCooltestersMay\\test-output\\screenshots\\7_10_2021\\TC001\\TC001.html");
//	  extentTest = reports.startTest(this.getClass().getSimpleName());
	  
  }
  
  @Test
  public void TC006_Admin_Search_Employee_POM_Script() {
	  
	  //Step 1
	  login.setup(GlobalVariables.QA_URL);
	  
	  //Step 2
	  login.loginOrange(username, password);
	  
	  seleniumWrapper.sleep(1);
//	  extentTest.log(LogStatus.PASS, "Login"+extentTest.addScreenCapture(seleniumWrapper.takeScreenshot("login")));
//	  reports.endTest(extentTest);
//	  reports.flush();
	  
	  //Step 3
	  um.validateLoginSuccessfully();
	  
	  //Step 4
	  um.clickAdmin();
	  
	  //Step 5 & Step 6
	  um.searchUser(username, true);
	  
	  //Step 7
	  um.validateUserTable(username);
	  
	  //Step 8
	  login.logoutOrange();
  }

  @AfterTest
  public void afterTest() {
	  // Step 9
	  login.closeBrowser();
  }

}
