package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asssert_True_False 
{
	@Test
	public void test1()
	{
		String str="My name is Rupak";
		Assert.assertTrue(str.contains("Rupak"));
	}
	
	
	@Test
	public void test2()
	{
		Assert.assertTrue(false);
		
	}

}
