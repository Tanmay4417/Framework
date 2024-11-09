package com.Framework.Genericlibrary;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Framework.Excelfilelibrary.ReadExcelFile;
import com.Framework.PageRepository.PageManagment;
import com.Framework.WebDriverlibrary.WebDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest {
	public PageManagment pageMangmentobj;
	public WebDriverUtility webdriverobj;
	public ReadExcelFile excelutilityobj;
	public String username;
	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;

	@BeforeSuite
	public void suitsetup() {

		// Create the SparkReport
		spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the sparkReport Information
		spark.config().setDocumentTitle("Regression Testing for Register page");
		spark.config().setReportName("Regression suit");
		spark.config().setTheme(Theme.STANDARD);

		// Create the Extent Report
		report = new ExtentReports();

		// Attach the spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System information in Extent Report
		report.setSystemInfo("Devicename", "Harry");
		report.setSystemInfo("OperatingSystem", "WINDOWS11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("BrowserVersion", "chrome-128.0.6613.85");

	}

	@AfterSuite
	public void suiteTerminateSetup() {

		// Flush the Report information
		report.flush();
	}

	
	
	@Parameters({ "browsername", "weburl" })
	@BeforeClass
	public void browserSetup(String browser, String url) {

		// Createobject for allthe Repository
		createObjects();

		//username = excelutilityobj.readSingleData("Registerdata", 1, 1);
		// step1:Launch the browser

		webdriverobj.launchBrowser(browser);
		Reporter.log("Step1:Browser launched succesfully", true);

		// Maximize the Browser
		webdriverobj.maximizeTheBrowser();
		Reporter.log("Step1.1:Maximized the browser succesfully", true);

		// Step2:Navigating to application via URL
		// String url=ReadPropertyFile.readdata("weburl");
		webdriverobj.NavigateToApplication(url);
		Reporter.log("Step2:Navigating to application via URL succesfully", true);

	}

	@AfterClass
	public void terminatebrowser() {
		// Step17:Close the browser
		webdriverobj.closeAllBrowsers();
		Reporter.log("Step17:Browser closed succesfully", true);
	}

	public void createObjects() {
		webdriverobj = new WebDriverUtility();
		excelutilityobj = new ReadExcelFile();

	}

}
