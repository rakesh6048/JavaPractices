package ForPractice_TestScript;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadDataHSS {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fin = new FileInputStream("D:/Read&WriteExcel/Book2.xls");
			
			HSSFWorkbook  wb = new HSSFWorkbook(fin);
			
			HSSFSheet s = wb.getSheet("Sheet");
			
			int rowCount = s.getLastRowNum()-s.getFirstRowNum();
			
			for(int i=0;i<rowCount;i++) {
				
				int columnCount = s.getRow(i).getLastCellNum();
				
				for(int j=0;j<columnCount;j++) {
					System.out.print(s.getRow(i).getCell(j).getStringCellValue());
				}
				
				System.out.println("\n");
				
			}
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
