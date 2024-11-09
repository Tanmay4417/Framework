package Demo;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	@Test

	public void DemoTesting1() {

		// Create the SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the sparkReport Information
		spark.config().setDocumentTitle("Regression Testing for Register page");
		spark.config().setReportName("Regression suit");
		spark.config().setTheme(Theme.DARK);

		// Create the Extent Report
		ExtentReports report = new ExtentReports();

		// Attach the spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System information in Extent Report
		report.setSystemInfo("Devicename", "Harry");
		report.setSystemInfo("OperatingSystem", "WINDOWS11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("BrowserVersion", "chrome-128.0.6613.85");

		// Create the Test Information
		ExtentTest test = report.createTest("RegressionTest");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching the Browser Succesful");

		test.log(Status.INFO, "Step2: Navigation to Application via URI Succesful");

		test.log(Status.INFO, "Step3: Verify the Webpage  Succesful");

		if ("Harry".equals("Harry")) {
			test.log(Status.PASS, "Step4:Verify the Webelement Displayed");
		} else {
			test.log(Status.FAIL, "Step4:Verify the Webelement Displayed");
		}

		test.log(Status.SKIP, "Step5:Element is Hidden");

		// Flush the Report information
		report.flush();
		
		System.out.println("Execution done");

	}
	
	public void DemoTesting2() {
		
		// Create the SparkReport
				ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

				// Configure the sparkReport Information
				spark.config().setDocumentTitle("Regression Testing for Register page");
				spark.config().setReportName("Regression suit");
				spark.config().setTheme(Theme.DARK);

				// Create the Extent Report
				ExtentReports report = new ExtentReports();

				// Attach the spark Report and ExtentReport
				report.attachReporter(spark);

				// Configure the System information in Extent Report
				report.setSystemInfo("Devicename", "Harry");
				report.setSystemInfo("OperatingSystem", "WINDOWS11");
				report.setSystemInfo("Browser", "Chrome");
				report.setSystemInfo("BrowserVersion", "chrome-128.0.6613.85");

				// Create the Test Information
				ExtentTest test = report.createTest("RegressionTest");

				// Steps Information
				test.log(Status.INFO, "Step1: Launching the Browser Succesful");

				test.log(Status.INFO, "Step2: Navigation to Application via URI Succesful");

				test.log(Status.INFO, "Step3: Verify the Webpage  Succesful");

				if ("Harry".equals("Harry")) {
					test.log(Status.PASS, "Step4:Verify the Webelement Displayed");
				} else {
					test.log(Status.FAIL, "Step4:Verify the Webelement Displayed");
				}

				//test.log(Status.SKIP, "Step5:Element is Hidden");

				// Flush the Report information
				report.flush();
				
				System.out.println("Execution done");

	
	}
	
	
	
	
	public void DemoTesting3() {
		
	}
	
	
	public void DemoTesting4() {
		
		
		
	}
	
	public void DemoTesting5() {
		
		
	}
	
	}



