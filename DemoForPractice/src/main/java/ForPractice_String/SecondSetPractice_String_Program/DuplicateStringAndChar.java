package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

import ForPractice_Collection_Program.HashMap;

public class DuplicateStringAndChar {
	
	@Test(priority =1, enabled = false)
	public void verifyDuplicateString() {
		
		String s1="My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh My name is rakesh Kumar Sngh welcome to java";
		
		String s2[]=s1.split(" ");
		
		for(int i=0;i<s2.length;i++) {
			int count=1;
			for(int j=i+1;j<s2.length;j++) {
				
				if(s2[i].equalsIgnoreCase(s2[j])) {
					s2[j]="0";
					count++;
				}
			}
			if(s2[i]!="0") {
				System.out.println(s2[i]+" = "+count);
			}
		}
	}
	
	@Test(priority =1, enabled = false)
	public void verifyDuplicateCharacter() {
		
		String s1="asdfasdfgag11hdjbfm5590@#@";
		
		char ch[] = s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				
				 if(ch[i]==ch[j]) {
					  ch[j]='0';
					  count++;
				  }
			}
			if(ch[i]!='0') {
				System.out.println(ch[i]+" = "+count);
			}
		}
		
	}
	
	@Test(priority =1, enabled = true)
	public void verifyDuplicateChar() {
		
		String s1="asdfasdfgag11hdjbfm5590@#@";
		
		java.util.HashMap<Character, Integer> hmp = new java.util.HashMap<Character, Integer>();
		
		char ch[] = s1.toCharArray();
		
		for(Character value : ch) {
			if(Character.isAlphabetic(value) || Character.isDigit(value)) {
				if(hmp.containsKey(value)) {
					hmp.put(value, hmp.get(value)+1);
				}else {
					hmp.put(value, 1);
				}
			}
		}
		System.out.println(hmp);
	}


}
