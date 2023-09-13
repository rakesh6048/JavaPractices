package ForPractice_String.SecondSetPractice_String_Program;

public class Testing2 {

	public static void main(String[] args) {

		String s1="Welcome to java Welcome to java hhdcj jfj";
		   
		   String s2[]=s1.split(" ");
		   
		   for(int i=0;i<s2.length;i++){
		      int count=1;
		      for(int j=i+1;j<s2.length;j++){
			  
			    if(s2[i].equals(s2[j])){
				   s2[j]="".trim();
				   count++;
			  
			  }
		      }
			  
			  if(s2[i]!=""){
			    System.out.println(s2[i]+"="+count);
			  }
			}
		   
		   for(int i=0;i<s2.length;i++) {
			   System.out.print(s2[i]+" ");
		   }

	}

}
