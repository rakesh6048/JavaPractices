package ForPractice_TestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Demo {
		
  @Test
  public void test() throws FileNotFoundException {
	  
	  Properties prop =new Properties();
	  
	  FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//EmployeeDetails.properties");
	  
	  try {
	   
	   prop.load(fis);
	   
	   System.out.println("Name : "+prop.getProperty("name"));
	   System.out.println("Address : "+prop.getProperty("address"));
		  
	  }catch(Exception e) {
		System.out.println(e);
	  }
	  
  }
}
