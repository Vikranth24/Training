package Frame;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Work_with_exe_13 {
	
	
	public int a;
	public int b;
	public String s;
	@BeforeClass
	public void AOI() throws Exception
	{
	String path="./Test_Data\\Excel Worksheet.xlsx";
	File file=new File(path);
	FileInputStream fil=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fil);
	Sheet sheet=book.getSheet("Sheet1");
	
	
	
	
	 a=sheet.getPhysicalNumberOfRows();
	 System.out.println(a);
	 
     b=sheet.getRow(0).getPhysicalNumberOfCells();
    
     System.out.println(b);
     for(int i=0;i<a;i++)
     {
     	for(int j=0; j<b;j++)
     	{
     	System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"      ");
     }
     	System.out.println();
     	}
 	
 	
     
}}
