package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Pattern4 {

	@Test
	public void patter4() {
		
		for(int i=7;i>=1;i--) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j+" ");			  
		  }
		  System.out.println();
		}
		
		for(int i=2;i<=7;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
		}
	}
}
