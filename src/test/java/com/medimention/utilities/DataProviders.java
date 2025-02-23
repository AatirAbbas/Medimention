package com.medimention.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.medimention.utilities.ExcelUtility;

public class DataProviders {
	@DataProvider(name="RegisterData")
	public String[][] getData() throws IOException
	{
		String path=".\\Test_Data\\Medimention_Registration_Data.xlsx";
		
		ExcelUtility xlutil=new ExcelUtility(path);
		
		int totalrows=xlutil.getRowCount("Sheet1");
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String registerdata[][]=new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				registerdata[i-1][j]= xlutil.getCellData("Sheet1", i, j);
			}
		}
		return registerdata;
	}
}
