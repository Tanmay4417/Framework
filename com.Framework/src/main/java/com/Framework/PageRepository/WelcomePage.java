package com.Framework.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WelcomePage {

	// Initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	// Declaration
	@FindBy(id = "name")
	private WebElement nametextfield;

	@FindBy(id = "email")
	private WebElement emailtextfield;

	@FindBy(id = "password")
	private WebElement passwordtextfield;

	@FindBy(id = "mobile")
	private WebElement mobilenotextfield;

	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement gender;

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement place;

	@FindBy(xpath = "//td//select[@name='country1']")
	private WebElement country;

	@FindBy(xpath = "//textarea[@id='feedback']")
	private WebElement feedback;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploadfile;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement link;

	// Initialization
	public WebElement getNametextfield() {
		return nametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getMobilenotextfield() {
		return mobilenotextfield;
	}

	public WebElement getLink() {
		return link;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPlace() {
		return place;
	}

	public WebElement getCountry() {
		Select s = new Select(country);
		s.selectByValue("ind");
		return country;
	}

	public WebElement getFeedback() {

		return feedback;
	}

	public WebElement getUploadfile() {
		return uploadfile;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getPlacesgoafield() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getFileupload() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getDateofbirth() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getRegister() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
