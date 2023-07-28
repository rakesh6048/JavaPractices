package ForPractice_Collection_Program.First_Collection_Program;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMap {

	public static void main(String[] args) {
	
		java.util.HashMap<String, Integer> hmp = new java.util.HashMap<String, Integer>();
		
		hmp.put("Rakesh",101);
		hmp.put("Mohan",102);
		hmp.put("AAAA",103);
		hmp.put("Mohan",104);
	    
	    //System.out.println(ht.toString());
	    

        for(Map.Entry entery : hmp.entrySet()) {
        	System.out.print(entery.getKey()+" ");
        }
	}

}
