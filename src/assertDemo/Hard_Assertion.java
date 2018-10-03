package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion 
{
	@Test
	public void test1()
	{
		Assert.assertEquals(12,13);
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("Test case 2 Started");
		Assert.assertEquals(12,13,"Dropdown count does not match please check with developers");
		System.out.println("Test case 2 completed");
		
	}

	@Test
	public void  test3()
	{
		System.out.println("Test case 3 started");
		Assert.assertEquals("Hello","Hello","word does not match please raise a bug");
		System.out.println("Test case 3 completed");
		
	}
}
