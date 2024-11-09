package com.Framework.PageRepository;

import org.openqa.selenium.WebDriver;

public class PageManagment {

	public WebDriver driver;
	public LoginPage loginpageobj;
	public RegisterPage registerpageobj;
	public WelcomePage welcomepageobj;

	// Intialization
	public PageManagment(WebDriver driver) {
		this.driver = driver;
	}

	// Declaration
	// Implementation

	public LoginPage initloginpage() {
		loginpageobj = new LoginPage(driver);
		return loginpageobj;
	}

	public WelcomePage initwelcomepage() {
		welcomepageobj = new WelcomePage(driver);
		return welcomepageobj;
	}

	public RegisterPage initregisterpage() {
		registerpageobj = new RegisterPage(driver);
		return this.registerpageobj;
	}

}
