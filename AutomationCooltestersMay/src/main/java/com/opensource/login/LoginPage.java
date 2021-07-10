package com.opensource.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper{
	
	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Objetos
	By txtUsername = By.xpath("//input[@id='txtUsername']");
	By txtPassword = By.xpath("//input[@id='txtPassword']");
	By btnLogin = By.xpath("//input[@id='btnLogin']");
	By btnWelcome = By.xpath("//a[@id=\"welcome\"]");
	By btnLogout = By.xpath("//a[contains(text(), 'Logout')]");
	
	//Metodos
	
	/**
	 * Set up environment
	 * @author ravalos
	 */
	public void setup(String url) {
		launchBrowser(url);
		takeScreenshot("lauchBrowser");
	}
	
	/**
	 * Login Orange App
	 * @author ravalos
	 */
	public void loginOrange(String username, String password) {
		reportLog("Login OrangeHRM web page...");
		type(username, txtUsername);
		type(password, txtPassword);
		takeScreenshot("EnteringUserPwd");
		click(btnLogin);
		implicitWait(5);
		takeScreenshot("LoggedApp");
	}
	
	/**
	 * Log out Orange
	 * @author ravalos
	 */
	public void logoutOrange() {
		reportLog("Logout OrangeHRM web page...");
		click(btnWelcome);
		click(btnLogout);
		implicitWait(5);
		takeScreenshot("Logout");
	}
	
}
