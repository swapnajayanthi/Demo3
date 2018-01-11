package com.rameshsoft.scripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.rameshsoft.automation.driverengine.DriverUtility;
import com.rameshsoft.automation.functionutilities.PropertiesFunction;
import com.rameshsoft.automation.functionutilities.TextFilesUtility;

public class AmazonTest extends DriverUtility  {
	@Test
public void test() throws IOException

	{

	getWebDriver().get("https://www.amazon.com");
    PropertiesFunction pf = new PropertiesFunction("C:\\Users\\jayanthi\\workspace\\utilities\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR.Amazon.properties");
    String dept = pf.getProperty("amazon_dept");
   WebElement departments =  getWebDriver().findElement(By.xpath(dept));
   Actions a = new Actions(getWebDriver());
   a.moveToElement(departments).build().perform();
   String text = departments.getText();
   TextFilesUtility tf = new TextFilesUtility("C:\\Users\\jayanthi\\workspace\\utilities\\src\\com\\rameshsoft\\selenium\\objectrepository\\Amazon.txt");
    tf.writeData(text);
    
   

	}

}
