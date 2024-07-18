package com.titrate.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadXl
{
	@Test
	public  void dataReadTest() throws Exception
	{
		File src=new File("C:\\Users\\DELL\\eclipse-workspace\\Titrate\\src\\test\\java\\com\\titrate\\testData\\Book1.xlsx");


		FileInputStream fis=new FileInputStream(src);

		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		XSSFSheet sheet=xsf.getSheetAt(0);
		String entry1= sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(entry1);		


	}
}
