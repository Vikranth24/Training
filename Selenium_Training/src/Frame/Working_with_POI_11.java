package Frame;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class Working_with_POI_11 {
	@Test
	public void POI() throws Exception
	{
	String path="./Test_Data\\Excel Worksheet.xlsx";
	File file=new File(path);
	FileInputStream fil=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fil);
	Sheet sheet=book.getSheet("Sheet1");
	System.out.println(sheet.getPhysicalNumberOfRows());

	System.out.println(sheet.getRow(0).getPhysicalNumberOfCells());
	System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
	}

}
