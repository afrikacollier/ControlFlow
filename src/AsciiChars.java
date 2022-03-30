
public class AsciiChars {
	
	  public static void printNumbers()
	  {
		 //Write code to print the numbers 0-9.
		  for(char i='0'; i<='9'; ++i) { 
			  System.out.println(i);
		  }		  
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
		  for(char i ='a'; i<='z'; ++i) { //you can also use unicode (unicode-table.com)
			  System.out.println(i);
		  }
	  }

	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
		  for(char i='A'; i<='Z'; i++) {
			  System.out.println(i);
		  }
	  }
	  
	  public static void main(String[] args) {
		  AsciiChars.printNumbers();
		  AsciiChars.printLowerCase();
		  AsciiChars.printUpperCase();
	  }
 }
