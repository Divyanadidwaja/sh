package com.Practice.Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fi= new FileInputStream(".\\src\\test\\resources\\Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fi);
		wb.getSheet("Sheet1").createRow(6).createCell(0).setCellValue("ibm");
		FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\Excel.xlsx");
		wb.write(fout);
		wb.close();
		
	}

}
