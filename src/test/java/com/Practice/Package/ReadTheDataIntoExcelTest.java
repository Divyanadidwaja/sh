package com.Practice.Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;

public class ReadTheDataIntoExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi= new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		Sheet sh=wb.getSheet("Sheet1");
		int RowCount=sh.getLastRowNum();
		int CelCount=sh.getRow(0).getLastCellNum();
		for(int i=0;i<RowCount;i++)//row
		{
			for(int j=0;j<CelCount;j++)//cell
			{
				String value=sh.getRow(i).getCell(j).getStringCellValue();
			//	driver.findelement(By.xpath(value));
				System.out.print(value+" ");
				
			}
			System.out.println();
		}
			
		

	}

}
