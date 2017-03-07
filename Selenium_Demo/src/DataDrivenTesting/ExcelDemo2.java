package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo2 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream f1= new FileInputStream("E:/Java_selenium/Book1.xlsx");
		Workbook wb = new WorkbookFactory().create(f1);
		Cell c= wb.getSheet("Sheet1").getRow(0).getCell(0);
		String v= c.toString();
		System.out.println(v);
	
		//For writing the value
		Cell c1= wb.getSheet("Sheet1").getRow(0).getCell(1);
		c1.setCellValue("manager");
		
		FileOutputStream fos = new FileOutputStream("E:/Java_selenium/Book2.xlsx");
		wb.write(fos);
		
	}
}
