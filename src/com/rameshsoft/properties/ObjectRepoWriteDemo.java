
//write a program for wrting data to a properties file


package com.rameshsoft.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ObjectRepoWriteDemo {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\jayanthi\\workspace\\seleniumproperties\\src\\com\\properties\\selenium\\java\\OR.properties");
		p.load(fis);
		p.setProperty("name", "jayanthi");
		p.setProperty("course", "selenium");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\jayanthi\\workspace\\seleniumproperties\\src\\com\\properties\\selenium\\java\\OR.properties");
		//p.store("new", FileOutputStream("C:\\Users\\jayanthi\\workspace\\seleniumproperties\\src\\com\\properties\\selenium\\java\\OR.properties"));
        p.store(fos, "successfully added data into propertiesfile");
	}

	
	}


