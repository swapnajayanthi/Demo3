package com.rameshsoft.automation.pojo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.rameshsoft.automation.functionutilities.ExcelReader;
import com.rameshsoft.automation.functionutilities.PropertiesFunction;
import com.rameshsoft.automation.functionutilities.TextFilesUtility;

public class Pojo {
	private static String configFile = "C:\\Users\\jayanthi\\workspace\\utilities\\config.properties";
	private static String browserutilFile = "C:\\Users\\jayanthi\\workspace\\utilities\\browser.utilities";
	private static String orFile = "C:\\Users\\jayanthi\\workspace\\utilities\\src\\com\\rameshsoft\\selenium\\objectrepository\\OR.Gmail.properties";
	private static String excelFile = "C:\\Users\\jayanthi\\workspace\\utilities\\src\\com\\rameshsoft\\automation\\excelsheets\\gmail.xls.xlsx";
	private static String textFile = "C:\\Users\\jayanthi\\workspace\\utilities\\text.txt";
	
	static public PropertiesFunction getConfigFile()
	{
		PropertiesFunction pf = new PropertiesFunction(configFile);
		return pf;
	}
	static public PropertiesFunction getBrowserutilFile()
	{
		PropertiesFunction pf = new PropertiesFunction(browserutilFile);
		return pf;
	}
	static public PropertiesFunction getOrFile()
	{
		PropertiesFunction pf = new PropertiesFunction(orFile);
		return pf;
	}
	static public ExcelReader getExcelFile() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		ExcelReader er = new ExcelReader(excelFile);
		return er;
	}
	static public TextFilesUtility getTextFile() throws IOException
	{
		TextFilesUtility t = new TextFilesUtility(textFile);
		return t;
	}
	
	
	
	
	
	
	
	
	
	

}
