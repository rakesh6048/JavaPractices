package ForPractice_TestScript;

import static ForPractice_TestScript.Properties.prop;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBDCConnectivity extends Properties {
	
	public static java.util.Properties empDetails=null;
	static String url ="Jdbc:mysql://localhost:3306/demo_sq_practice";
	static String userName = "admin";
	static String password = "admin";

	public static void main(String[] args) {

		try {
			empDetails = new java.util.Properties();
			
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "//EmployeeDetails.properties");
			empDetails.load(ip);
			
			System.out.println(empDetails.getProperty("name"));
			
			//Register the Driver Class
			
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
			// Create a Connections
			  
			 Connection connection = DriverManager.getConnection(url, userName, password);
			 
			 //Create a statement
			 
			 Statement st = connection.createStatement();
			 
			 //Execute a query
			 
			 ResultSet rs = st.executeQuery("select * from emp");
			 
			 while(rs.next()) {
				 
				 if(empDetails.getProperty("name").equals(rs.getString(2))) {
					 System.out.println(rs.getString(2));
				 }
				 if(empDetails.getProperty("address").equals(rs.getString(3))) {
					 System.out.println(rs.getString(3));
				 }
				 if(empDetails.getProperty("salary").equals(rs.getString(4))) {
					 System.out.println(rs.getString(4));
				 }if(empDetails.getProperty("doj").equals(rs.getString(5))) {
					 System.out.println(rs.getString(5));
				 } 
			 }
			 //Close the connection
			 
			 connection.close();
			
    	   
       }catch(Exception e) {
    	   System.out.println(e);
       }

	}

}
