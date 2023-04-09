package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		
		try {
			
		  FileInputStream fin= new FileInputStream("E:/workspace1/JavaPractices/f.txt");
		  ObjectInputStream oin = new ObjectInputStream(fin);
		  
		  Student s =(Student)oin.readObject();
		  System.out.println("Student Id : "+s.id);
		  System.out.println("Student name : "+s.name);
		  System.out.println("Student age : "+s.age);
		  oin.close(); 
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
