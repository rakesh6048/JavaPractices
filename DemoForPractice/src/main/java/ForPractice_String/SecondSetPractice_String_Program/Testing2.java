package ForPractice_String.SecondSetPractice_String_Program;

import java.util.HashMap;

public class Testing2 {

	public static void main(String[] args) {

		String s1="Welcome to java Welcome to java hhdcj jfj";
		   
		   String s2[]=s1.split(" ");
		   
		   HashMap<String, Integer> hmp = new HashMap<String, Integer>();
		   
		   for(String value : s2) {
			   
			   if(hmp.containsKey(value)) {
				   hmp.put(value, hmp.get(value)+1);
			   }else {
				   hmp.put(value, 1);
			   }
		   }
		   
		   System.out.println(hmp);

	}

}
