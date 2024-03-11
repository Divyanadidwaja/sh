package com.Practice.Package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WriteTheDataToJsonTest {

	public static void main(String[] args) throws IOException 
	{
		FileReader filepath	=new FileReader(".\\src\\test\\resources\\CommonData.json");
		Properties pobj=new Properties();
		pobj.setProperty("browser", "chrome");
		pobj.setProperty("url", "http://localhost:8888");
		pobj.setProperty("username", "admin");
		pobj.setProperty("password", "admin");
		FileOutputStream fout	=new FileOutputStream (".\\src\\test\\resources\\CommonData.json");
		pobj.store(fout, "Write data");
		

	}

}
    