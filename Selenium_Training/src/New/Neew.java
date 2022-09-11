package New;

import org.testng.annotations.Test;

public class Neew {
	@Test
	public void Register()
	{
		
		System.out.println(" Register");
		
	}
	
	@Test(groups = ("Sanity"))
	public void Login()
	{
		
		System.out.println("Login");
		
	}
	
	
	@Test(dependsOnMethods = "Login")
	public void Search()
	{
		
		System.out.println("Search");
		
	}

	
	
	@Test(groups = ("Sanity"),dependsOnMethods = "Search")
	public void Shop()
	{
		
		System.out.println("Shop");
		
	}


}
