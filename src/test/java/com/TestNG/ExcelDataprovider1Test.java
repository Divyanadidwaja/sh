package com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelDataprovider1Test
{
@DataProvider
public  Object[][] excelData() throws EncryptedDocumentException, IOException
{
	FileInputStream fi=new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
	Workbook wb = WorkbookFactory.create(fi);
	Sheet sh = wb.getSheet("DataProvider");
	int lastRow = sh.getLastRowNum()+1;
	short lastCell = sh.getRow(0).getLastCellNum();
	Object[][] obj=new Object[lastRow][lastCell];
	for(int i=0;i<lastRow; i++ )
	{
		for(int j=0;j<lastCell;j++)
		{
			obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return obj;
	
	
}


}
