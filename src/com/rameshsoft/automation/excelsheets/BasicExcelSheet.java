package com.rameshsoft.automation.excelsheets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.examples.CreateCell;

import com.rameshsoft.automation.driverengine.DriverUtility;

public class BasicExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\jayanthi\\workspace\\utilities\\src\\com\\rameshsoft\\automation\\excelsheets\\gmail.xls.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet s1 = wb.getSheet("Sheet1");
	/*Row r00 = s1.getRow(0);
	Cell c00 = r00.getCell(0);
	String data1 = c00.getStringCellValue();
	System.out.println("zero  row and zero column:"+data1);
	
	Cell c01 = r00.getCell(1);
	String data2 = c01.getStringCellValue();
	System.out.println("zero row and 1st coloumn:"+data2);
    Row r10 = s1.getRow(1);
    Cell c10 = r10.getCell(0);
    String data3 = c10.getStringCellValue();
    System.out.println("1st row and zero coloumn:"+data3);
   
    Cell c11 = r10.getCell(1);
    String data4 = c11.getStringCellValue();
    System.out.println("1st row and 1st coloumn:"+data4);*/
	
	Row r10 = s1.getRow(1);
	Cell c10 = r10.getCell(0);
	String data1 = c10.getStringCellValue();
	System.out.println("1st row and zero column:"+data1);
	
	Cell c11 = r10.getCell(1);
	String data2 = c11.getStringCellValue();
	System.out.println("1st row 1st column:"+data2);
    
    
    
	}

}
