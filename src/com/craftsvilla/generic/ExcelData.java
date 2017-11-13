package com.craftsvilla.generic;

import java.io.File;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static String getData(String path,String sheet,int rn,int cn)
	{
		try
		{
			File file=new File(path);
			String data=WorkbookFactory.create(file).getSheet(sheet).getRow(rn).getCell(cn).getStringCellValue();
			return data;
		}
		catch(Exception e)
		{
			return " ";
		}
	}

	

}
