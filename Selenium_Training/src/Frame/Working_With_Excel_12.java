package Frame;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Working_With_Excel_12 {
	@Test
	public void POI() throws Exception
	{
	String path="./Test_Data\\Excel Worksheet.xlsx";
	File file=new File(path);
	FileInputStream fil=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fil);
	Sheet sheet=book.getSheet("Sheet1");
	int a=sheet.getPhysicalNumberOfRows();
    int b=sheet.getRow(0).getPhysicalNumberOfCells();
    for(int i=0;i<a;i++)
    {
    	for(int j=0; j<b;j++)
    	{
    	System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+"      ");
    }
    	System.out.println();
    	}
	
	}

}
