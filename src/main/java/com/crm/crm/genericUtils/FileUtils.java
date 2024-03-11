package com.crm.crm.genericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtils
{
public String readDataFromPropertyFile(String key) throws Exception
{
	FileInputStream fis=new FileInputStream(IpathConstants.PropertyFilepath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value=pobj.getProperty(key);
	return value;
}
}
