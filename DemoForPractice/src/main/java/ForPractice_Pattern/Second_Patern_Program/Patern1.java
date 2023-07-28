package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Patern1 {

	@Test
	public void patern1() {
		
		for(int i=1;i<=5;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(j+" ");
		   }
		   System.out.println();
		}
		
	}
}
