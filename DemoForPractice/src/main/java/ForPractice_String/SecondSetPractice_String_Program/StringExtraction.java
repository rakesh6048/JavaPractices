package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringExtraction {
	
	
	@Test
	public void verifyStringExtraction() {
		
		String s1="welcome30java";
		String s2="w5el2come25";
		
		String alphabet_s1= s1.replaceAll("[^a-z]", "");
		String number_s1 = s1.replaceAll("[^0-9]", "");
		String alphabet_s2= s2.replaceAll("[^a-z]", "");
		String number_s2 = s2.replaceAll("[^0-9]", "");
		
		System.out.println("alphabet_s1 : "+alphabet_s1);
		System.out.println("number_s1 : "+number_s1);
		System.out.println("alphabet_s2 : "+alphabet_s2);
		System.out.println("number_s2 : "+number_s2);
	}

}
