package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TeDhenat {
	@DataProvider(name="TeDhenat")
	public Object[][] mbushja() throws BiffException,IOException,Exception {
	     FileInputStream filepath = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Seleniumi\\src\\Selenium\\TeDhenat.xls");

	     Workbook wb = Workbook.getWorkbook(filepath);
	     Sheet sheet = wb.getSheet("TeDhenat");

	     int row = sheet.getRows();
	     int column = sheet.getColumns();
	     String Testdata[][] = new String[row - 1][column];
	     int count = 0;

	     for (int i = 1; i < row; i++) {
	      for (int j = 0; j < column; j++) {
	       Cell cell = sheet.getCell(j, i);
	       Testdata[count][j] = cell.getContents();
	      }
	      count++;
	     }
	     filepath.close();
	     return Testdata;
	    }
	
}
