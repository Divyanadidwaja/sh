package com.Practice.Package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadTheDataFromJsontest {

	public static void main(String[] args) throws IOException, ParseException {
	FileReader filepath	=new FileReader(".\\src\\test\\resources\\CommonData.json");
	JSONParser parser=new JSONParser();
	Object obj=parser.parse(filepath);
	JSONObject map=(JSONObject) obj;
	System.out.println(map.get("browser"));
	System.out.println(map.get("url"));
	System.out.println(map.get("username"));
	System.out.println(map.get("password"));
	

	}

}
