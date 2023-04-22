package ForPractice_Collection_Program;

import java.util.HashSet;
import java.util.Set;

public class ArrayList {

	public static void main(String[] args) {

     java.util.ArrayList<String> al =new java.util.ArrayList<String>();
     
     al.add("Book");
     al.add("Pen");
     al.add("Pencil");
     al.add("Book");
     al.add("Pen");
     
     System.out.println(al.toString());
     
     for(String s: al) {
    	 System.out.println(s);
     }
     
     Set<String> s= new HashSet<String>(al);
     
     System.out.println(s);
	}

}