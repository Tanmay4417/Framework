package com.Framework.WelcomeTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import com.Framework.Genericlibrary.BaseTest;
import com.Framework.PageRepository.PageManagment;
import com.Framework.javalibrary.JavaUtility;
import com.aventstack.extentreports.Status;

public class VerifyWelcomePageTest extends BaseTest {

	@Test(priority = 1)
	public void verifywelcomepageWithValidInput() {

		// Create the Test Information
		test = report.createTest("verifywelcomepageWithValidInput");

		// Execute the Precondition---->1.Launch the Browser,2.Navigate to URL
		test.log(Status.INFO, "<----Execution Starts succesfully--->");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the Welcome Page Using title
		String exptitle = "Learning Selenium";
		String acttitle = webdriverobj.driver.getTitle();

		Assert.assertEquals(acttitle, exptitle);
		Reporter.log("Title Verified" + acttitle, true);

		// Create object of PageManager
		pageMangmentobj = new PageManagment(webdriverobj.driver);

		// ---------------------------------------------------------------------------------------------------------------------------------//
		// Verify the Name TextField
		boolean result = pageMangmentobj.initwelcomepage().getNametextfield().isDisplayed();

		Assert.assertTrue(result);
		Reporter.log("Name TextField is Displayed", true);

		// Step3:Perform Action--Clear
		pageMangmentobj.initwelcomepage().getNametextfield().clear();

		test.log(Status.INFO, "Step3:Clear Action done succesfully-NameTextField");

		// Step4:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getNametextfield().sendKeys("Tanmay");
		test.log(Status.INFO, "Step4:SendKeys Action done succesfully-NameTextField");

		// See the execution
		JavaUtility.pause(3000);

		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the EmailTextField
		boolean result1 = pageMangmentobj.initwelcomepage().getEmailtextfield().isDisplayed();
		Assert.assertTrue(result1);
		Reporter.log("Email TextField is Displayed", true);

		// Step5:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getEmailtextfield().sendKeys("prashanthchinthalapati@gmail.com");
		test.log(Status.INFO, "Step5:SendKeys Action done succesfully-EmailTextField");
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the PasswordTextField
		boolean result2 = pageMangmentobj.initwelcomepage().getPasswordtextfield().isDisplayed();
		Assert.assertTrue(result2);
		test.log(Status.PASS, "Password TextField is Displayed");

		// Step6:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getPasswordtextfield().sendKeys("Prashanth@25");
		test.log(Status.INFO, "Step6:SendKeys Action done succesfully-PasswordTextField");
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the PasswordTextField
		boolean result3 = pageMangmentobj.initwelcomepage().getEmailtextfield().isDisplayed();
		Assert.assertTrue(result3);
		test.log(Status.PASS, "Mobilenum TextField is Displayed");

		// Step7:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getEmailtextfield().sendKeys("8464944599");
		System.out.println("Step7:SendKeys Action done succesfully-MobileTextField");
		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the GenderField
		boolean result4 = pageMangmentobj.initwelcomepage().getGender().isDisplayed();
		Assert.assertTrue(result4);
		test.log(Status.PASS, "GenderField is Displayed");

		// Step8:Perform Action--Click
		pageMangmentobj.initwelcomepage().getGender().click();
		test.log(Status.INFO, "Step8:Click Action done succesfully-GenderField");

		// -------------------------------------------------------------------------------------------------------------------------------//
		// Verify the PlacesField
		boolean result5 = pageMangmentobj.initwelcomepage().getPlacesgoafield().isDisplayed();
		Assert.assertTrue(result5);
		test.log(Status.PASS, "PlaceField is Displayed");

		// Step9:Perform Action--Undo click
		pageMangmentobj.initwelcomepage().getPlacesgoafield().click();
		test.log(Status.INFO, "Step9:Undo Click Action done succesfully-GoaPlaceField");
		// Step10:Perform Action--Click
		pageMangmentobj.initwelcomepage().getPlacesgoafield().click();
		test.log(Status.INFO, "Step10:Click Action done succesfully-BanglorePlaceField");
		// -------------------------------------------------------------------------------------------------------------------------------//
		// Verify the CountryField
		boolean result6 = pageMangmentobj.initwelcomepage().getCountry().isDisplayed();

		Assert.assertTrue(result6);
		test.log(Status.PASS, "Country is Displayed");

		// Step11:Create Select object reference for country
		Select s1 = new Select(pageMangmentobj.initwelcomepage().getCountry());
		if (!s1.isMultiple()) {
			s1.selectByVisibleText("INDIA");
			test.log(Status.INFO, "Step11:INDIA option is selected successfully");
		}
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the CountryField2
		boolean result7 = pageMangmentobj.initwelcomepage().getCountry().isDisplayed();
		Assert.assertTrue(result7);

		test.log(Status.PASS, "Country2 is Displayed");

		// Step12:Create Select object reference for country2
		s1 = new Select(pageMangmentobj.initwelcomepage().getCountry());
		if (s1.isMultiple()) {
			s1.selectByVisibleText("INDIA");
			s1.selectByVisibleText("AUSTRALIA");
			s1.selectByVisibleText("USA");
			test.log(Status.INFO, "Step12:Options is selected successfully");
		}
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the FeedbackTextField
		boolean result8 = pageMangmentobj.initwelcomepage().getFeedback().isDisplayed();
		Assert.assertTrue(result8);
		test.log(Status.PASS, "Feedback Field is Displayed");

		// Step13:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getFeedback().sendKeys("Prashanth is a good boy");
		test.log(Status.INFO, "Step13:Perform Action done succesfully-FeedbackField");

		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the FileuploadField
		boolean result9 = pageMangmentobj.initwelcomepage().getFileupload().isDisplayed();
		Assert.assertTrue(result9);
		test.log(Status.PASS, "Fileupload is Displayed");

		// Step14:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getFileupload()
				.sendKeys("C:/Users/DELL/Downloads/Chinthalapati_Prashanth_Resume.pdf");
		Reporter.log("Step14:Perform Action done succesfully-Fileupload", true);
		// -----------------------------------------------------------------------------------------------//
		// see the Execution
		JavaUtility.pause(3000);
		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the DOBField
		boolean result10 = pageMangmentobj.initwelcomepage().getDateofbirth().isDisplayed();
		Assert.assertTrue(result10);
		test.log(Status.PASS, "DOB is Displayed");

		// Step15:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getDateofbirth().sendKeys("25-07-2000 / 22:10");
		test.log(Status.INFO, "Step15:Perform Action done succesfully-DOB");

		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the RegisterField
		boolean result11 = pageMangmentobj.initwelcomepage().getRegister().isDisplayed();
		Assert.assertTrue(result11);
		test.log(Status.INFO, "Register is Displayed");

		// Step16:Perform Action--Click
		pageMangmentobj.initwelcomepage().getRegister().click();
		test.log(Status.INFO, "Step16:Click Action done succesfully-Register");
		// --------------------------------------------------------------------------------------------------------------------------//
		// see the Execution
		JavaUtility.pause(3000);

		// Soft Assert Statement
		SoftAssert softassertobj = new SoftAssert();

		// Verify the name
		softassertobj.assertEquals("Contact Us", pageMangmentobj.initwelcomepage().getRegister());
		test.log(Status.INFO, "Verified Text Succesfully _ Contsct us Hyperlink");
		softassertobj.assertAll();

		// Execute Post condition-->Terminate the browser
		// BaseTest.terminatebrowser();

		// Execution Log or Status
		Reporter.log("<----Execution completed succesfully---Testcase pass-->", true);

	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "verifywelcomepageWithValidInput")
	public void verifyWelcomepageWithinValidinput() {

		// Create the Test Information
		test = report.createTest("verifyWelcomepageWithinValidinput");

		// Execute the Precondition---->1.Launch the Browser,2.Navigate to URL
		test.log(Status.INFO, "<----Execution Starts succesfully- Test2-->");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify Title
		String exptitle = "Learning Selenium";
		String acttitle = webdriverobj.driver.getTitle();

		Assert.assertEquals(acttitle, exptitle);
		Reporter.log("Title Verified" + acttitle, true);

		// Create object of PageManager
		pageMangmentobj = new PageManagment(webdriverobj.driver);

		// ---------------------------------------------------------------------------------------------------------------------------------//
		// Verify the Name TextField
		boolean result = pageMangmentobj.initwelcomepage().getNametextfield().isDisplayed();

		Assert.assertTrue(result);
		Reporter.log("Name TextField is Displayed", true);

		// Step3:Perform Action--Clear
		pageMangmentobj.initwelcomepage().getNametextfield().clear();

		test.log(Status.INFO, "Step3:Clear Action done succesfully-NameTextField");

		// Step4:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getNametextfield().sendKeys("w,enn,ndlklkjln,sm;d5emm;5w.w.");
		test.log(Status.INFO, "Step4:SendKeys Action done succesfully-NameTextField");

		// See the execution
		JavaUtility.pause(3000);

		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the EmailTextField
		boolean result1 = pageMangmentobj.initwelcomepage().getEmailtextfield().isDisplayed();
		Assert.assertTrue(result1);
		Reporter.log("Email TextField is Displayed", true);

		// Step5:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getEmailtextfield().sendKeys("prashanthchinthalapati@gmail.com");
		test.log(Status.INFO, "Step5:SendKeys Action done succesfully-EmailTextField");
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the PasswordTextField
		boolean result2 = pageMangmentobj.initwelcomepage().getPasswordtextfield().isDisplayed();
		Assert.assertTrue(result2);
		test.log(Status.PASS, "Password TextField is Displayed");

		// Step6:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getPasswordtextfield().sendKeys("Prashanth@25");
		test.log(Status.INFO, "Step6:SendKeys Action done succesfully-PasswordTextField");
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the PasswordTextField
		boolean result3 = pageMangmentobj.initwelcomepage().getEmailtextfield().isDisplayed();
		Assert.assertTrue(result3);
		test.log(Status.PASS, "Mobilenum TextField is Displayed");

		// Step7:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getEmailtextfield().sendKeys("8464944599");
		System.out.println("Step7:SendKeys Action done succesfully-MobileTextField");
		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the GenderField
		boolean result4 = pageMangmentobj.initwelcomepage().getGender().isDisplayed();
		Assert.assertTrue(result4);
		test.log(Status.PASS, "GenderField is Displayed");

		// Step8:Perform Action--Click
		pageMangmentobj.initwelcomepage().getGender().click();
		test.log(Status.INFO, "Step8:Click Action done succesfully-GenderField");

		// -------------------------------------------------------------------------------------------------------------------------------//
		// Verify the PlacesField
		boolean result5 = pageMangmentobj.initwelcomepage().getPlacesgoafield().isDisplayed();
		Assert.assertTrue(result5);
		test.log(Status.PASS, "PlaceField is Displayed");

		// Step9:Perform Action--Undo click
		pageMangmentobj.initwelcomepage().getPlacesgoafield().click();
		test.log(Status.INFO, "Step9:Undo Click Action done succesfully-GoaPlaceField");
		// Step10:Perform Action--Click
		pageMangmentobj.initwelcomepage().getPlacesgoafield().click();
		test.log(Status.INFO, "Step10:Click Action done succesfully-BanglorePlaceField");
		// -------------------------------------------------------------------------------------------------------------------------------//
		// Verify the CountryField
		boolean result6 = pageMangmentobj.initwelcomepage().getCountry().isDisplayed();

		Assert.assertTrue(result6);
		test.log(Status.PASS, "Country is Displayed");

		// Step11:Create Select object reference for country
		Select s1 = new Select(pageMangmentobj.initwelcomepage().getCountry());
		if (!s1.isMultiple()) {
			s1.selectByVisibleText("INDIA");
			test.log(Status.INFO, "Step11:INDIA option is selected successfully");
		}
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the CountryField2
		boolean result7 = pageMangmentobj.initwelcomepage().getCountry().isDisplayed();
		Assert.assertTrue(result7);

		test.log(Status.PASS, "Country2 is Displayed");

		// Step12:Create Select object reference for country2
		s1 = new Select(pageMangmentobj.initwelcomepage().getCountry());
		if (s1.isMultiple()) {
			s1.selectByVisibleText("INDIA");
			s1.selectByVisibleText("AUSTRALIA");
			s1.selectByVisibleText("USA");
			test.log(Status.INFO, "Step12:Options is selected successfully");
		}
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the FeedbackTextField
		boolean result8 = pageMangmentobj.initwelcomepage().getFeedback().isDisplayed();
		Assert.assertTrue(result8);
		test.log(Status.PASS, "Feedback Field is Displayed");

		// Step13:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getFeedback().sendKeys("Prashanth is a good boy");
		test.log(Status.INFO, "Step13:Perform Action done succesfully-FeedbackField");

		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the FileuploadField
		boolean result9 = pageMangmentobj.initwelcomepage().getFileupload().isDisplayed();
		Assert.assertTrue(result9);
		test.log(Status.PASS, "Fileupload is Displayed");

		// Step14:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getFileupload()
				.sendKeys("C:/Users/DELL/Downloads/Chinthalapati_Prashanth_Resume.pdf");
		Reporter.log("Step14:Perform Action done succesfully-Fileupload", true);
		// -----------------------------------------------------------------------------------------------//
		// see the Execution
		JavaUtility.pause(3000);
		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the DOBField
		boolean result10 = pageMangmentobj.initwelcomepage().getDateofbirth().isDisplayed();
		Assert.assertTrue(result10);
		test.log(Status.PASS, "DOB is Displayed");

		// Step15:Perform Action--SendKeys
		pageMangmentobj.initwelcomepage().getDateofbirth().sendKeys("25-07-2000 / 22:10");
		test.log(Status.INFO, "Step15:Perform Action done succesfully-DOB");

		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the RegisterField
		boolean result11 = pageMangmentobj.initwelcomepage().getRegister().isDisplayed();
		Assert.assertTrue(result11);
		test.log(Status.INFO, "Register is Displayed");

		// Step16:Perform Action--Click
		pageMangmentobj.initwelcomepage().getRegister().click();
		test.log(Status.INFO, "Step16:Click Action done succesfully-Register");
		// --------------------------------------------------------------------------------------------------------------------------//
		// see the Execution
		JavaUtility.pause(3000);

		// Used to fail TestScript fail
		// Assert.fail();

		// Execute Post condition-->Terminate the browser
		// BaseTest.terminatebrowser();

		// Execution Log or Status
		Reporter.log("<----Execution completed succesfully>", true);

	}

}
