package Basics;

import net.sourceforge.htmlunit.corejs.javascript.tools.debugger.Main;

public class Bike extends Vehicle
{
	
	void run()
	{
		System.out.println("Bike is safety");
		
	}
	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.run();
	}
}
