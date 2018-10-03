package ioStreams_Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class HTML_FileCreation {
  @Test
  public void f() throws Exception {
	  File f=new File("D:\\workspace1\\SeleniumAutomation\\test-output\\Test.html");
	  FileWriter fw=new FileWriter(f);
	  BufferedWriter bw=new BufferedWriter(fw);
	bw.write("<table cellspacing='2' cellpading='3' border='2'>");
	  bw.write("<tbody>");
	  bw.write("<tr>");
		  bw.write("<td>");
		  bw.write("<font face='bold' size='100' color='orange'>");
		  bw.write("Rupak");
		  bw.write("</font>");
		  bw.write("</td>");
bw.write("<td><font face='bold' size='6' color='pink'>Deepak</font></td>");
		  bw.write("<td>Tanmay</td>");
	  bw.write("</tr>");
	  
	  bw.write("<tr>");
bw.write("<td><font face='bold' size='6' color='blue'>Pikun</font></td>");
	  	bw.write("<td>Raju</td>");
	  	bw.write("<td>Tikun</td>");
	  bw.write("</tr>");
	  
	  bw.write("<tr>");
	  bw.write("<td>");
bw.write("<a href='D:/WorkSpace_730AM/SeleniumAutomation/ScreenShots/FailedmFAQs.png' target='_blank'>Nagesh</a>");
	  bw.write("</td>");
	  bw.write("</tr>");
	  
	  bw.write("</tbody>");
	  bw.write("</table>");
	  bw.close();
	  
  }
}
