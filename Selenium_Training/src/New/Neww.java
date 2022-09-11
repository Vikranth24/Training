
package New;

import org.testng.annotations.Test;

public class Neww {
	
	@Test(groups = ("Sanity"))
	public void add()
	{
		int a=2;
		int b=4;
		int c=a+b;
		System.out.println(c+"  is added");
		
	}
	
	@Test(groups = ("Sanity"))
	public void mul()
	{
		int a=2;
		int b=4;
		int c=a*b;
		System.out.println(c+"   is multiplied");
		
	}
	
	
	@Test
	public void sub()
	{
		int a=2;
		int b=4;
		int c=b-a;
		System.out.println(c+"   is subtrscted");
		
	}

	
	
	@Test(groups = ("Sanity"),dependsOnMethods = "mul")
	public void div()
	{
		int a=2;
		int b=4;
		int c=b/a;
		System.out.println(c+"    is Divided");
		
	}

}
