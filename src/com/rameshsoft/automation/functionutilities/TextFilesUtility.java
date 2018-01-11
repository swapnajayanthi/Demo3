package com.rameshsoft.automation.functionutilities;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import org.testng.reporters.Buffer;

	public class TextFilesUtility {
		String filepath;
		FileWriter fw;
		BufferedWriter bw;
		FileReader fr;
		BufferedReader br;
		
		public TextFilesUtility(String filepath) throws IOException
		{
			this.filepath=filepath;
			File file = new File(filepath);
			file.createNewFile();
			fw = new FileWriter(file);
			bw =new BufferedWriter(fw);
			fr =  new FileReader(file);
			br = new BufferedReader(fr);
		}
		public String getData() throws IOException
		{
			String data = null;
			if(data!=null)
			{
				data = br.readLine();
			}
			else
			{
				System.out.println("BR is null.....pls cross check");
			}
			return data;	
		}
		public  List<String> getAllData() throws IOException
		{
			List<String> data = new ArrayList<String>();
			if(br!=null)
			{
				while(br.ready())
				{
					String data1 = br.readLine();
					data.add(data1);
				}
			}
			else
			{
				System.out.println("BR is null....pls cross chec");
			}
			return data;
		}
		public void writeData(int data) throws IOException
		{
			bw.write(data);
			bw.flush();
		}
		public void writeData(String data) throws IOException
		{
			bw.write(data);
			bw.flush();
		}
	
		
			
		}
		
		
		

	


