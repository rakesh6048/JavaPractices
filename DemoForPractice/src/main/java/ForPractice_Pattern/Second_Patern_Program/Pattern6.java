package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Pattern6 {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=7;i++) {
		  for(int j=7;j>=i;j--) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
		}
		
	}
}
