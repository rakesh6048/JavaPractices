package ForPractice_Number.Second_Practice_Number;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PerfectNumber {
	
	@Test
	public void perfectNumber() {
		
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		int check=n;
		
		//Perfect Number 28
		
		for(int i=1;i<n;i++) {
			
			if(n%i == 0) {
				sum = sum+i;
			}
		}
		if(sum == check) {
			System.out.println("Number is perfect : "+sum);
		}else {
			System.out.println("Number is not perfect : "+sum);
		}
		
	}

}
