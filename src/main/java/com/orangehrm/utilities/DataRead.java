package com.orangehrm.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataRead {
   @DataProvider
	public String[][] getData() throws IOException
	{
	FileInputStream	fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\MavenOrangeHRM\\src\\main\\resources\\Config.properties");
	  Properties prop=new Properties();
	  prop.load(fis);
	  String un=prop.getProperty("userId");
	  String pw=prop.getProperty("password");
	String[][] data=new String[][] {{un,pw}};
		return data;
	}
   @DataProvider
   public Object[][] getDataXL() throws IOException
   {
	   
	  FileInputStream fs = new FileInputStream("G:\\testData2007.xlsx");
	   XSSFWorkbook workbook = new XSSFWorkbook(fs);
	      XSSFSheet sheet = workbook.getSheetAt(0);
	     int r = sheet.getPhysicalNumberOfRows();
	     int c = sheet.getRow(0).getPhysicalNumberOfCells();
	     Object[][] xldata = new Object[r][c];
	       for( int i =0;i<r;i++)
	       {
	    	   for(int j=0;j<c;j++)
	    	   {
	    		  xldata[i][j] =sheet.getRow(i).getCell(j).getStringCellValue();
	    	   }
	       }
	       workbook.close();
	       fs.close();
	       return xldata;
	     
   }
}
