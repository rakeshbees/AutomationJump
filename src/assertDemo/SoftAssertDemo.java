package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 

{
	@Test
	public void testsoftAssert()
	{
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test 1 Started");
		assertion.assertEquals(10, 11,"count doesnt match");
		System.out.println("Test 1 completed");
		assertion.assertAll();
	}
	
	@Test
	public void testhardAssert()
	{
		System.out.println("Test 2 started");
		Assert.assertEquals(10,11);
		System.out.println("Test 2 completed");
	}

}
