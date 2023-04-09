package ForPractice_TestScript;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleReadDataFromExcel {

	public static void main(String[] args) {
		
		Row r=null;
		Cell c;
		
		try {
	    FileInputStream fi = new FileInputStream("D:/Read&WriteExcel/EmployeeDetails.xlsx");
	    Workbook wb = WorkbookFactory.create(fi);
	    Sheet s = wb.getSheet("Sheet1");
	    
	    r = s.getRow(0);
	    c = r.getCell(1);
	    String str = c.getStringCellValue();
	    System.out.println("Name : "+str);
	    
	    r = s.getRow(1);
	    c = r.getCell(1);
	    String str1 = c.getStringCellValue();
	    System.out.println("Address : "+str1);
		
			
			
		}catch(Exception e) {
			
		System.out.println(e);
			
		}
		

	}

}
