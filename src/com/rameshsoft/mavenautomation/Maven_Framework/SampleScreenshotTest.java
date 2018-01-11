package com.rameshsoft.mavenautomation.Maven_Framework;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleScreenshotTest {
	WebDriver d;
	private Object TakesScreenshot;

	@Test 
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files selenium\\chromedriver_win32\\.chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("headless");
		d = new ChromeDriver(c);
		d.get("https://www.gmail.com");
		System.out.println("url entered");
		d.findElement(By.id("identifierId")).sendKeys("jayanthi123");
		System.out.println("username entered");
		d.findElement(By.id("identifierNext")).click();
	}
		@AfterMethod
		public void afterMethod(ITestResult t)
		{
			if(ITestResult.FAILURE==t.getStatus())
			TakesScreenshot ts = (TakesScreenshot)d;
			File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C://abcd.jpeg"));
			
			
		}
		public static void screenshot(String name) {
			// TODO Auto-generated method stub
			
		}
		

}
