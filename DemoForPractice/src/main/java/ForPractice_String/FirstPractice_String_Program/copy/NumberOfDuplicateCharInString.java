package ForPractice_String.FirstPractice_String_Program.copy;

import java.util.HashMap;

public class NumberOfDuplicateCharInString {

	public static void main(String[] args) {
		
		String s1="asdfasdfgag11hdjbfm5590@#@";
		
		HashMap<Character, Integer> hmp = new HashMap<Character, Integer>();
		
		char ch[]=s1.toCharArray();
		
		for(Character value : ch) {
			if(Character.isAlphabetic(value) || Character.isDigit(value)) {
				if(hmp.containsKey(value)) {
					hmp.put(value, hmp.get(value)+1);
				}else {
					hmp.put(value, 1);
				}
			}
		}
	  //for(String)
		
	   System.out.println(hmp);
		
	}

}
