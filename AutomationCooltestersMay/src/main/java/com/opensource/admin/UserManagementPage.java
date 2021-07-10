package com.opensource.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class UserManagementPage extends SeleniumWrapper{

	public UserManagementPage(WebDriver driver) {
		super(driver);
	}
	
	By linkUM = By.xpath("//a[@id=\"menu_admin_viewAdminModule\"]");
	By txtUsername = By.xpath("//input[@id='searchSystemUser_userName']");
	By txtSearchUser = By.xpath("//input[@id='searchSystemUser_userName']");
	By btnSearch = By.xpath("//input[@id='searchBtn']");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	
	/**
	 * Validate Login success
	 * @author ravalos
	 */
	public void validateLoginSuccessfully() {
		reportLog("Validate that you have logged in successfully");
		waitForElementPresent(linkUM);
		takeScreenshot("LoggedSuccessfully");
	}
	
	/**
	 * Click Admin
	 * @author ravalos
	 */
	public void clickAdmin() {
		reportLog("Click Admin - Go to the admin page");
		click(linkUM);
		waitForElementPresent(txtUsername);
		takeScreenshot("ClickAdmin");
	}
	
	/**
	 * Search username
	 * @author ravalos
	 */
	public void searchUser(String username, boolean clickSearch) {
		reportLog("Search username in field 'Username'");
		type(username, txtSearchUser);
		takeScreenshot("EnteringUser");
		if(clickSearch){
			click(btnSearch);
			takeScreenshot("ClickSearchBtn");
		}
	}
	
	/**
	 * Validate user exists in table
	 * @author ravalos
	 */
	public void validateUserTable(String expectedUser) {
		reportLog("Verify username exist in table");
		String actualUser = getValueFromTable("1", "2");
		assertEquals(actualUser, expectedUser);
		takeScreenshot("ValidateUser_"+actualUser);
	}
	
	

}
