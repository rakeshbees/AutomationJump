package TestNG;
public class Ajax 
{
	public static void main(String[] args) 
	{
		System.out.println("A main");
		m1();
	}
	static void m1(){
		System.out.println("A m1");
		main(new String[0]);
	}
}
