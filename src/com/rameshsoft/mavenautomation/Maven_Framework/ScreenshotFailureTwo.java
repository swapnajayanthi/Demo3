package com.rameshsoft.mavenautomation.Maven_Framework;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public abstract class ScreenshotFailureTwo implements ITestListener {
	@Test
	public void onTestFailure(ITestResult result)
	{
	SampleScreenshotTest.screenshot(result.getName());
	
	}
}
