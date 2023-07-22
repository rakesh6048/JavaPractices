package Latest_Practice_TestScripts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadDataFromTextFile {
	
	@Test
	public void readFromTextFile() throws FileNotFoundException {
		
		FileReader fr = new FileReader("D:/Read&WriteExcel/demo.txt");
		
		Scanner input = new Scanner(fr);
		StringBuilder sb = new StringBuilder();
		
		while(input.hasNext()) {
			//System.out.println(sb.append(input.next()).toString());
			sb.append(input.next()+" ");
		}
		String output = sb.toString();
		System.out.println(output);
	}

}
