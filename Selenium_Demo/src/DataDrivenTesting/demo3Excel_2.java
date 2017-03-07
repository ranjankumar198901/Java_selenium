package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class demo3Excel_2 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream("E:/Java_selenium/Data1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Cell rc = wb.getSheet("Sheet1").getRow(0).getCell(0);
		
		String v = rc.toString();  //returns value instead of address
		System.out.println(v);
		
	}
}


