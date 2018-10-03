package Testreports;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class HTML_Report {
  @Test
  public void createTXT() throws Exception {
	 File f=new File("D:\\workspace1\\SeleniumAutomation\\Test_Reports\\sample1.txt");
	 FileWriter fw=new FileWriter(f,true);
	 BufferedWriter bw=new BufferedWriter(fw);
	 bw.write("Rupak");
	 bw.newLine();
	 bw.write("Raj");
	 bw.newLine();
	 bw.write("Testing");
	 bw.close();
  }




 @Test
 public void createHTML() throws Exception{
	 File f=new File(".\\Test_Reports\\sample1.html");
	 FileWriter fw=new FileWriter(f);
	 BufferedWriter bw=new BufferedWriter(fw);
	 bw.write("<table cellspecing='2'cellpading='3'border='3'>");
	 bw.write("<tbody>");
	 bw.write("<tr>");
	 bw.write("<td>");
	 bw.write("Rupak");
	 bw.write("</td>");
	 bw.write("<td>");
	 bw.write("Deepak");
	 bw.write("</td>");
	 bw.write("</tr>");
	 bw.write("<tr>");
	 bw.write("<td>Manual Testing</td>");
	 bw.write("<td>Automation Testing</td>");
	 bw.write("</tr>");
	 bw.write("<tr>");
	 bw.write("<td><font size='8'color='Greeen'>Raj</font></td>");
	 bw.write("<td><font size='10'color='pink'>Ram</font></td>");
	 bw.write("</tr>");
	 bw.write("</tbody>");
	 bw.write("</table>");
	 bw.close();
	 
 }
	 
 }

 
 
