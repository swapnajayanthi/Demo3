package com.rameshsoft.mavenautomation.Maven_Framework;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleFailurTc {
	static WebDriver d;
	@Test
	public void main()
	{
		d = new ChromeDriver();
		d.get("https://www.gmail.com");
		System.out.println("gmail is opened");
		d.findElement(By.id("identifierI")).sendKeys("jayanrhi123");
	}
	public static void screenShot(String name)
	{
		TakesScreenshot e = (TakesScreenshot)d;
		File f = e.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\"+name+".jpeg)");
	}

}
