package Testreports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readdata_XLSX {
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream(".\\Excel file\\HMSTestData.xlsx");
	XSSFWorkbook w=new XSSFWorkbook(fi);//for XLSX
	//HSSFWorkbook w=new HSSFWorkbook(fi);//for XLS
	Sheet s=w.getSheet("data");
	System.out.println("Total rows:"+s.getLastRowNum());
	Row r=s.getRow(0);
	System.out.println("Total cells in the row:"+r.getLastCellNum());
	Cell c=r.getCell(0);
	Cell c1=r.getCell(1);
	System.out.println(c);
	System.out.println(c1);
	
	Row r1=s.getRow(1);
	
	Cell c2=r.getCell(0);
	Cell c3=r.getCell(1);
	System.out.println(c2);
	System.out.println(c3);
	
	Row r2=s.getRow(2);
	
	Cell c4=r.getCell(0);
	Cell c5=r.getCell(1);
  

	
	
  }
}
