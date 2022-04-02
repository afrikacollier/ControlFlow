import java.util.Random;
import java.util.Scanner;

public class ControlFlowAssignment {
	
	  public static void printNumbers() {
		 //Write code to print the numbers 0-9.
		  for(char i='0'; i<='9'; ++i) { 
			  System.out.println(i);
		  }		  
	  }

	  public static void printLowerCase() {
	    // TODO: print valid lowercase alphabetic input
		  for(char i ='a'; i<='z'; ++i) { //you can also use unicode (unicode-table.com)
			  System.out.println(i);
		  }
	  }

	  public static void printUpperCase() {
	    // TODO: print valid uppercase alphabetic input
		  for(char i='A'; i<='Z'; i++) {
			  System.out.println(i);
		  }
	  }
	  
	  public static void main(String[] args) {
		  ControlFlowAssignment.printNumbers();
		  ControlFlowAssignment.printLowerCase();
		  ControlFlowAssignment.printUpperCase();
		  

		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Please enter your name: ");     // type a word and hit enter
		  String someString = scanner.nextLine();
		  System.out.println("Hello " + someString);
		  System.out.println("Do you wish to continue to the interactive portion? ");
		  String someStringTwo = scanner.nextLine();
		  String s = new String("yes");
		  String b = new String("y");
		  if(someStringTwo.equals(s) || someStringTwo.equals(b)) {
			  outer: 
				  for( ; ; ) {
					  /* 1.Use a loop to repeatedly ask the user some questions. 
					   * What will be done is to gather some random information from the 
					   * user and then generate their potential winning Powerball numbers.  
					   * At the end, ask them if they would like to generate another set 
					   * of numbers.  Note that it may be helpful to put example responses 
					   * after each question.  */
					  System.out.println("Do you have a red car? (yes, no): ");
					  String someStringThree = scanner.nextLine();
					  System.out.println("What is your favorite pet? "); 
					  String someStringFour = scanner.nextLine();
					  System.out.println("How old is your favorite pet? ");
					  Integer someStringFive = scanner.nextInt();
					  System.out.println("What is their lucky number ");
					  Integer someStringSix = scanner.nextInt();
					  System.out.println("Do you have a favorite quarterback? ");
					  String someStringSeven = scanner.next();
					  int someStringEight=0;//we need it accessible in outside scope ~IMPORTANT TO NOTE
					  if (someStringSeven.equals(s) || someStringSeven.equals(b)) {
						  System.out.println("If so what is their jersey number? ");
						  someStringEight = scanner.nextInt();
					  }
					  System.out.println("What is the two-digit model year of your car? "); 
					  Integer someStringNine = scanner.nextInt();
					  System.out.println("What is the first name of your favorite actor or actress? ");
					  String someStringTen = scanner.next();
					  System.out.println("Enter a number between 1 and 50: ");
					  Integer someStringEleven = scanner.nextInt();
					  Random rand = new Random();
					  int anArray[] = new int[3];
					  for(int i = 0; i <anArray.length; ++i) {
						  anArray[i] = rand.nextInt(65)+1; //0 -> 1 and 64 -> 65
					  }
					  int PowerBallArray[] = new int[7];
					  PowerBallArray[0] = Math.abs((someStringEight-anArray[1])%66+1);
					  PowerBallArray[1] = someStringTen.charAt(0)%66+1;
					  PowerBallArray[2] = (someStringNine + someStringSix)%66+1;
					  PowerBallArray[3] = 42;
					  PowerBallArray[4] = (someStringFive + someStringNine)%66+1;
					  PowerBallArray[5] = (someStringEight*anArray[2])%66+1;
					  System.out.println("Lottery Numbers" + ": " + PowerBallArray[0] + ", " + PowerBallArray[1] + ", " + PowerBallArray[2] + ", " + PowerBallArray[3] + ", " + PowerBallArray[4] + "  Magic Ball: " + PowerBallArray[5]);
					  System.out.println("Would you like to generate another set of numbers? ");
					  String someStringTwelve = scanner.next();
					  if(someStringTwelve.equals(s) || someStringTwelve.equals(b)) {
						  String someStringThirteen = scanner.nextLine(); 
						  continue outer;
					  }else {
						  System.out.println("Thank you for participating.");
						  break;
					  }
				  }
		  }else {
			  System.out.println("Please return later to complete the survey.");
		  }
	  
	  }
}

