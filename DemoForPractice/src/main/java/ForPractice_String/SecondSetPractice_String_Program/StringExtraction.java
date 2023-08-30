package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.annotations.Test;

public class StringExtraction {
	
	
	//@Test
	public void verifyStringExtraction() {
		
		String s1="welcome30java";
		String s2="w5el2come25";
		
		String alphabet_s1 =s1.replaceAll("[^a-z]", "");
		String number_s1 =s1.replaceAll("[^0-9]", "");
		
		System.out.println("alphabet_s1 : "+alphabet_s1);
		System.out.println("number_s1 : "+number_s1);
		//System.out.println("alphabet_s2 : "+alphabet_s2);
		//System.out.println("number_s2 : "+number_s2);
		
		String s3="10dfdf90sdff100";
		
		String num_s3= s3.replaceAll("[^0-9]", "");
		
		System.out.println(num_s3);
		
		String first = num_s3.substring(0,2);
		 String second = num_s3.substring(2,4);
		 String Third = num_s3.substring(4,7);
		 
		 int a=Integer.valueOf(first);
		 int b=Integer.valueOf(second);
		 int c=Integer.valueOf(Third);
		 
		 int finaldigit=a+b+c; 
		 System.out.println(finaldigit);
	}

	@Test
	public void test() {
		
		String s1="gahg hklio ddog ggg";
		        s1 = s1.replaceAll("\\s", "");
		        System.out.println(s1);
		        
		  int totalNumbers = s1.length();
		  
		  System.out.println(totalNumbers);
		  
		  String s2 = s1.replaceAll("gahg hklio ddog ggg", "g");
		  
		  System.out.println(s2);
		  System.out.println();	  
	}
}
