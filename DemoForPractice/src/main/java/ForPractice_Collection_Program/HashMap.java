package ForPractice_Collection_Program;

import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
	
		java.util.HashMap<Integer, String> hmp = new java.util.HashMap<Integer, String>();
		
		hmp.put(101, "Rakesh");
		hmp.put(102, "Mohan");
		hmp.put(104, "AAAA");
		hmp.put(104, "Rohan");
		
		for(Map.Entry<Integer, String> m : hmp.entrySet()) {
			
			System.out.println(m.getKey() +" "+ m.getValue());
		}

	}

}
