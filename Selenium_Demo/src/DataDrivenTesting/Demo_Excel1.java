package DataDrivenTesting;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_Excel1 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File  f = new File("E:/Java_selenium/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		
		// go to sheet --> Rows0 -->cell0
		
		Cell c = wb.getSheet("Sheet1").getRow(1).getCell(0);
		
		//get the value present in the cell
		String v = c.getStringCellValue();
		System.out.println(v);
		
	}
}
