package com.rameshsoft.mavenautomation.Maven_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserTest {
	@Test 
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files selenium\\chromedriver_win32\\.chromedriver.exe");
		ChromeOptions c = new ChromeOptions();
		c.addArguments("headless");
		WebDriver d = new ChromeDriver(c);
		d.get("https://www.gmail.com");
		System.out.println("url entered");
		d.findElement(By.id("identifierId")).sendKeys("jayanthi123");
		d.findElement(By.id("identifierNext")).click();
		
	}

}
