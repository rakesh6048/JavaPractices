package ForPractice_Pattern.Second_Patern_Program;

import org.testng.annotations.Test;

public class Pattern8 {
	
	public static void main(String args[]) {
		
		for(int i=1;i<=5;i++) {
		  for(int j=1;j<=5;j++) {
			  
			  if(i==1 || i==5 || j==1 || j==5 ) {
				  System.out.print("*"+" ");
			  }else {
				  System.out.print(" "+" ");
			  }			  
		  }
		  System.out.println();
		}
	}

}
