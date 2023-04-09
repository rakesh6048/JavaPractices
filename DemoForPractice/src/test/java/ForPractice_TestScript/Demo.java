package ForPractice_TestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class Demo {
		
  @Test
  public void test() throws FileNotFoundException {
	  java.util.Properties prop = new java.util.Properties();
		
	   FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//EmployeeDetails.properties");
	   
	   try {
			prop.load(ip);
			
			String name = prop.getProperty("name");
			
			System.out.println("Name : "+name);
			System.out.println("Address : "+prop.getProperty("address"));
			}catch(Exception e) {
				System.out.println(e);
			}		
	  
  }
}
