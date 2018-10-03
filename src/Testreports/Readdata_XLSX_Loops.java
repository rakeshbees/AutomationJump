package Testreports;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class Readdata_XLSX_Loops {
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream("D:\\workspace1\\SeleniumAutomation\\Excel file\\HMSTestData.xlsx");
	  XSSFWorkbook w=new XSSFWorkbook(fi);
	  Sheet s=w.getSheet("login");
	  Row r;
	  Cell c;
	  for (int i = 0; i < s.getLastRowNum(); i++) {
		  r=s.getRow(i);
		  for (int j = 0; j < r.getLastCellNum(); j++) {
			  c=(Cell) r.getCell(j);
			  System.out.println(c.toString());
			
		}
		
	}
	  
  }
}
