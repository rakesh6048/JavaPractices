package ForPractice_TestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Properties {
	
	public static java.util.Properties prop =null;
	
	public static void main(String args[]) throws IOException {
		
		prop = new java.util.Properties();
	try {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//EmployeeDetails.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("address"));
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
	
	}
}
