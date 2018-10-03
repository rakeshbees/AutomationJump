package Basics;

public class Example extends Sample{
	Example()
	{
		System.out.println("ex no argument");
		
	}
	Example(int a)
	{
		System.out.println("ex int argument");
		
	}
	Example(String str)
	{
		super(10);
		System.out.println("ex string argument");
	}
	public static void main(String[] args) {
		Example e1=new Example();
		Example e2=new Example("abc");
	}
			
	

}
