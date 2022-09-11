package Utility_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Utility_Methods {
	
		public static String Test_Configration(String key)throws IOException
		{
			String Path="./Test_Configration/Config.Properties";
			File file=new File(Path);
			FileInputStream fil=new FileInputStream(file);
			
			Properties prop=new Properties();
					prop.load(fil);
					String Value=prop.getProperty(key);
					return Value;
			
			
			
		}

		 
	
			
		public static void Send_keys(WebElement element, String Name)
		{
			element.sendKeys(Name);
			
		}
		
		public static void click(WebElement element)
		{
			element.click();
			
		}
		public static Object[][] Data(String d) throws IOException
		{
			FileInputStream fil=new FileInputStream("./Test_Data\\Excel Worksheet.xlsx");
			Workbook book=new XSSFWorkbook(fil);
			Sheet sheet=book.getSheet(d);
			int a=sheet.getPhysicalNumberOfRows();
			 System.out.println(a);
			 
		   int  b=sheet.getRow(0).getPhysicalNumberOfCells();
		    
		     System.out.println(b);
			
			Object[][] data=new Object[a-1][b];
			int k=0;
			
			
			
			 for(int i=1;i<a;i++)
			    {
			    	for(int j=0; j<b;j++)
			    	{
			    		 data[k][j]=(sheet.getRow(i).getCell(j).getStringCellValue());
			    		 
			    		
			    	}
			    	k++;
			    	
			    	}
			 return data;
			 
		}}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

