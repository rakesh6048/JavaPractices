package ForPractice_TestScript;

import java.io.FileInputStream;

import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) {
		
		
		Row r = null;
		Cell c;
		
		try {
		FileInputStream fi = new FileInputStream("D:/Read&WriteExcel/EmployeeDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet s = wb.getSheet("Sheet1");
		r = s.getRow(0);
		
		int totalNumberOfRow = s.getLastRowNum();
		int totalNumberOfColumn = r.getLastCellNum();
		
		System.out.println("Total Number Of Row : "+totalNumberOfRow);
		System.out.println("Total Number of Column : "+totalNumberOfColumn);
		
		for(int i=0;i<totalNumberOfRow;i++) {
		   for(int j=0;j<totalNumberOfColumn;j++) {
			   
			   r = s.getRow(i);
			   c = r.getCell(j);
			   String str = c.getStringCellValue();
			   System.out.println(str);
		   }
		}
		
		
		}catch(Exception e) {
			
			System.out.println(e);
			
		}

	}

}
