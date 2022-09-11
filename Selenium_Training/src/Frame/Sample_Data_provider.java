
package Frame;

import org.testng.annotations.DataProvider;

public class Sample_Data_provider {
	
	 
	
	@DataProvider(name="Data")
	public Object[][] Test()
	{
		Object[][] data=new Object[1][2];
				data[0][0]="AAAAAAAAAAa";
		data[0][1]="BBBBBBBBBBBBBb";
		return data;
	}
	
	@org.testng.annotations.Test(dataProvider="Data")
	public void Tests(String PWD, String UN)
	{
		System.out.println(PWD);
		System.out.println(UN);
		
	}

}
