package com.rameshsoft.scripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\jayanthi\\workspace\\utilities\\src\\com\\rameshsoft\\selenium\\objectrepository\\Amazon.txt");
		boolean b = file.createNewFile();
		System.out.println(b);
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Departments");
		bw.flush();
	}

}
