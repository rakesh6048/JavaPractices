package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Pattern8 {
	
	@Test
	public void pattern8() {
		
		for(int i=1;i<=7;i++) {
		  for(int j=1;j<=7;j++) {
			  
			  if(i==1 || i==7 || j==1 || j==7 ) {
				  System.out.print("*"+" ");
			  }else {
				  System.out.print(" "+" ");
			  }			  
		  }
		  System.out.println();
		}
	}

}
