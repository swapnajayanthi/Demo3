package com.rameshsoft.scripts;

import com.rameshsoft.automation.driverengine.DriverUtility;

public class Gmail {
	public void login()
	{
		DriverUtility driverUtility = new DriverUtility();
		driverUtility.getWebDriver().get("https://www.gmail.com");
	}

}
