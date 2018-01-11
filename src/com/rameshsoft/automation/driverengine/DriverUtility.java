package com.rameshsoft.automation.driverengine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameters;

public class DriverUtility {
	private static WebDriver webdriver;
	@BeforeSuite
	public void OpenBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
	     System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver_win32\\chromedriver.exe");
	     webdriver = new ChromeDriver();
	     webdriver.manage().window().maximize();
	     webdriver.manage().deleteAllCookies();
	     webdriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			webdriver = new FirefoxDriver();
			webdriver.manage().window().maximize();
			webdriver.manage().deleteAllCookies();
			webdriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Program Files selenium\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
			webdriver = new InternetExplorerDriver();
			webdriver.manage().window().maximize();
			webdriver.manage().deleteAllCookies();
			webdriver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		}
	}
	public WebDriver getWebDriver()
	{
		return webdriver;
	}
	@AfterSuite
    public void closeBrowser()
		{
			if(webdriver!=null)
			{
				webdriver.close();
				System.out.println("closing the browser");
			}
			else
			{
				System.out.println("webdriver is null");
		    }
		}
			
	public static void main(String[] args) {
		DriverUtility driverutility = new DriverUtility();
		driverutility.OpenBrowser("firefox");
		driverutility.closeBrowser();
		
	}
	
}


