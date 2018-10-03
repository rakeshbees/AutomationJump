package Pom;

import org.testng.annotations.Test;

public class HMS_TestScript {
	HMS_LoginPage_Components loginpageComponents=new HMS_LoginPage_Components();
  @Test
  public void f() {
loginpageComponents.launchapp();
loginpageComponents.login();
loginpageComponents.navigate_To_PR();
loginpageComponents.cratepatient();
	  
	  
  }
}
