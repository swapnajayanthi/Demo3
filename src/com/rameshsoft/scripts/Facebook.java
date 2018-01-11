package com.rameshsoft.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.rameshsoft.automation.driverengine.DriverUtility;
import com.rameshsoft.automation.functionutilities.PropertiesFunction;

public class Facebook {
	@Test
	public void login()
	{
		DriverUtility driverUtility = new DriverUtility();
		driverUtility.getWebDriver().get("https://www.facebook.com");
		/*driverUtility.getWebDriver().findElement(By.id("u_0_l")).sendKeys("swapna");
		driverUtility.getWebDriver().findElement(By.id("u_0_n")).sendKeys("swapna");*/
	}
}
