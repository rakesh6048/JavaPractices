package ForPractice_Array;

public class CommonElementInArray {
	
	public static void main(String []args) {
		
		int arr1[] = {10,23,45,80,76,30,60};
		int arr2[] = {56,89,10,87,60,23};
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] ==arr2[j]) {
					System.out.print(arr1[i]+" ");
					
				}
			}
		}
		
		
	}

}
