package ForPractice_String;

public class StringTokenizer {

	public static void main(String[] args) {

      java.util.StringTokenizer st = new java.util.StringTokenizer("Welcome To Java");
      
      while(st.hasMoreTokens()) {
    	  System.out.println(st.nextToken());
      }
	}

}
