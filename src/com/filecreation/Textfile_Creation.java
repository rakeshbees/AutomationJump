package com.filecreation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.bouncycastle.crypto.BufferedAsymmetricBlockCipher;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

public class Textfile_Creation {
  @Test
  public void f() throws Exception
  {
	  File f=new File(".\\File creation folder\\rpk.txt");
	  
	  FileWriter fw=new FileWriter(f,true);
	  
	  BufferedWriter bw=new BufferedWriter(fw);
	  bw.write("Rupak kumar Sahu");
	  bw.newLine();
	  bw.write("Suraj Kumar Panigrahi");
	  bw.newLine();
	  bw.write("Agnibesh Biswas");
	  bw.newLine();
	  bw.write("Deepak Kumar Sahu");
	  bw.newLine();
	  bw.close();
	
  }
  @Test
	 public void read()throws Exception
	 {
	  File f=new File(".\\File creation folder\\rpk.txt");
	//  FileReader fr=new FileReader(f);
	  //BufferedReader br=new BufferedReader(fr);
	 // String str=br.readLine();
	  //System.out.println(str);
	  
	  
		 
	 }
}
