package com.Framework.WebDriverlibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

	public static  WebDriver driver_static;
	public  WebDriver driver;
	public  Select selectobj;
	public  Actions actionsobj;
	public  Robot robotobj;
	public WebDriverWait wait;
	
	
	public void launchBrowser(String browser)
	{
		//Step1:Launch the browser-chrome,fire fox,edge
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver_static=driver;
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver_static=driver;
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver_static=driver;
			break;
		default:
			Reporter.log("You Have Entered incorrect Browser Name",true); 
			break;
		}
	}

	public  void maximizeTheBrowser() 
	{
		driver.manage().window().maximize();
	}
	public  void NavigateToApplication(String Url)
	{
		driver.get("file:///D:/Selenium_programs/com.Framework/src/main/resources/SoftWares/webpage.html");
	}
	public  void closeTheBrowser()
	{
		driver.close();
	}
	public  void closeAllBrowsers()
	{
		driver.quit();
	}
	public  void waitImplicitly(long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}
	
	public  void waitExplicitly(long duration,WebElement element)
	{
        wait = new WebDriverWait(driver,duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectOptionInDropdown(WebElement element,int index)
	{
		selectobj.selectByIndex(index);;
	}
	public void selectOptionInDropdown(WebElement element,String visibletext)
	{
		selectobj.selectByVisibleText(visibletext);
	}
	public void selectOptionInDropdown(String value,WebElement element)
	{
		selectobj.selectByValue(value);
	}
	
	public void mouseHovering_movetoelement(WebElement element)
	{
		actionsobj.moveToElement(element).perform();
	}
	public void mouseHovering_click(WebElement element)
	{
		actionsobj.click(element).perform();
	}
	public void mouseHovering_contextclick(WebElement element)
	{
		actionsobj.contextClick(element).perform();
	}
	public void mouseHovering_doubleclick(WebElement element)
	{
		actionsobj.doubleClick(element).perform();
	}
	public void mouseHovering_Draganddrop(WebElement element1, WebElement element2)
	{
		actionsobj.dragAndDrop(element1, element2).perform();
	}
	
	
	public void pressTheKey_pageDown()
	{
		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	public void ReleaseTheKey_pageDown()
	{
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	public void AlertPopupAccept()
	{
		driver.switchTo().alert().accept();
	}
	public void AlertPopupDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchControlToFrame(int Index)
	{
		driver.switchTo().frame(0);
	}
	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	public void switchControlToWindow(String windowaddress)
	{
		driver.switchTo().window(windowaddress);
	}
	
}
