package ForPractice_TestScript;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class ReadDataHSS {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fin = new FileInputStream("D:/Read&WriteExcel/Book2.xls");
			
			HSSFWorkbook wb =new HSSFWorkbook(fin);
			HSSFSheet sheet = wb.getSheetAt(0);
			
			int numberOfRowCount =sheet.getLastRowNum()-sheet.getFirstRowNum();
			
			for(int i=0;i<numberOfRowCount;i++) {
				
				int numberofColumnCount = sheet.getRow(i).getLastCellNum();
				
				for(int j=0;j<numberofColumnCount;j++) {
					System.out.print(new DataFormatter().formatCellValue(sheet.getRow(i).getCell(j))+" ");
				}
				
				System.out.println();
			}
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
