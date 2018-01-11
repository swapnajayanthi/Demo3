package com.rameshsoft.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ObjectRepoReadDemo {

	
	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
        d.get("https://www.gmail.com");
		FileInputStream fis = new FileInputStream("C:\\Users\\jayanthi\\workspace\\seleniumproperties\\src\\com\\properties\\selenium\\java\\OR.Gmail.properties");
		Properties p = new Properties();
		p.load(fis);
		String gmail_username = p.getProperty("username");
		System.out.println("gmail username xpath is:"+gmail_username);
		String gmail_data = p.getProperty("data");
		System.out.println("gmail data is:"+gmail_data);
		d.findElement(By.xpath(gmail_username)).sendKeys(gmail_data);
		String gmail_next = p.getProperty("next");
		System.out.println("gmail next xpath is:"+gmail_next);
		d.findElement(By.xpath(gmail_next)).click();
	
		String gmail_password = p.getProperty("password");
		System.out.println("gmail password xpath is:"+gmail_password);
		String gmail_pwddata = p.getProperty("pwddata");
		System.out.println("gmail pwd data is:"+gmail_pwddata);
		  d.findElement(By.xpath(gmail_password)).sendKeys(gmail_pwddata);
	      
		String gmail_signIn = p.getProperty("signIn");
        System.out.println("gmail passwordsignin xpath is:"+gmail_signIn); 
        d.findElement(By.xpath(gmail_signIn)).click();
        
      
	}

}
