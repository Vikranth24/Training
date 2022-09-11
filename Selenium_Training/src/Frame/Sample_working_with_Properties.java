package Frame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



@Test
public class Sample_working_with_Properties {
	public void demo()throws IOException
	{
		String Path="./Test_Configration/Config.Properties";
		File file=new File(Path);
		FileInputStream fil=new FileInputStream(file);
		
		Properties prop=new Properties();
				prop.load(fil);
				System.out.println(prop.getProperty("Name"));
		
		
		
	}

}
