package Basics;

public class Rupakk {
	Rupakk()
	{
		System.out.println("ex no argmnt constructor ");
		
	}
	Rupakk(int a)
	{
		System.out.println("ex int argmnt constructor");
		
	}
	Rupakk(String str)
	{
		System.out.println("ex string argmnt constructor");
		
	}
	public static void main(String[] args) {
		Rupakk r1=new Rupakk();
		Rupakk r2=new Rupakk(10);
		Rupakk r3=new Rupakk("abc");
	}

}
