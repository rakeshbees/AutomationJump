package com.com.filecreation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

import bsh.org.objectweb.asm.Label;

public class CreateExcel {
  @Test
  public void f() throws Exception 
  {
	  FileOutputStream fo=new FileOutputStream(".\\File creation folder\\rpks.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(fo);
	  WritableSheet ws=wb.createSheet("Rupak",500);
	//  Label un=new Label(0,0,"User");
	 // ws.addCell(un);
			  
  }
}
