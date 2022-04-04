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
					  for( ; ; ) {
						  /* 1.Use a loop to repeatedly ask the user some questions. 
						   * What will be done is to gather some random information from the 
						   * user and then generate their potential winning Powerball numbers.  
						   * At the end, ask them if they would like to generate another set 
						   * of numbers.  Note that it may be helpful to put example responses 
						   * after each question.  */
						  System.out.println("Do you have a red car? (yes, no): ");
						  String haveRedCar = scanner.nextLine();
						  System.out.println("What is your favorite pet? "); 
						  String favoritePet = scanner.nextLine(); //let's try isEmpty instead
						  System.out.println("How old is your favorite pet?");
						  int ageOfPet;
						  do {
							  System.out.println("Please enter a positive number.");
							  while (!scanner.hasNextInt()) {
								  System.out.println("That's not a number.");
								  scanner.next();
							  }
						  ageOfPet = scanner.nextInt();  
						  } while(ageOfPet<=0);
						  System.out.println("What is their lucky number? ");
						  int luckyNumber;
						  do {
							  System.out.println("Please enter a positive number.");
							  while(!scanner.hasNextInt()) {
								  System.out.println("That's not a number.");
								  scanner.next();
							  }
						  luckyNumber = scanner.nextInt();
						  } while (luckyNumber <= 0);
						  scanner.nextLine();
						  System.out.println("Do you have a favorite quarterback? ");
						  String favoriteQuarterback = scanner.nextLine();
						  int jerseyNumber=0;//we need it accessible in outside scope ~IMPORTANT TO NOTE
						  if (favoriteQuarterback.equals(s) || favoriteQuarterback.equals(b)) {
							  System.out.println("If so what is their jersey number? ");
							  do {
								  System.out.println("Please enter a positive number.");
								  while(!scanner.hasNextInt()) {
									  System.out.println("That's not a number.");
									  scanner.next();
								  }
							  jerseyNumber = scanner.nextInt();
							  } while (jerseyNumber <= 0);
						  }
						  System.out.println("What is the two-digit model year of your car? ");
						  int twoDigitModelYear;
						  do {
							  System.out.println("Please enter a positive number.");
							  while(!scanner.hasNextInt()) {
								  System.out.println("That's not a number.");
								  scanner.next();
							  }
						  twoDigitModelYear = scanner.nextInt();
						  } while (twoDigitModelYear <= 0);
						  scanner.nextLine();
						  System.out.println("What is the first name of your favorite actor or actress? ");
						  String favoriteActorOrActress = scanner.nextLine();
						  System.out.println("Enter a number between 1 and 50: ");
						  int enterNumberBetweenOneAndFifty;
						  do {
							  System.out.println("Please enter a positive number.");
							  while(!scanner.hasNextInt()) {
								  System.out.println("That's not a number.");
								  scanner.next();
							  }
						  enterNumberBetweenOneAndFifty = scanner.nextInt();
						  } while (enterNumberBetweenOneAndFifty <= 0);
						  scanner.nextLine();
						  Random rand = new Random();
						  int anArray[] = new int[3];
						  for(int i = 0; i <anArray.length; ++i) {
							  anArray[i] = rand.nextInt(65)+1; //0 -> 1 and 64 -> 65
						  }
						  int PowerBallArray[] = new int[7];
						  PowerBallArray[0] = Math.abs((jerseyNumber-anArray[1]))%66+1;
						  PowerBallArray[1] = favoriteActorOrActress.charAt(0)%66+1;
						  PowerBallArray[2] = (twoDigitModelYear + luckyNumber)%66+1;
						  PowerBallArray[3] = 42;
						  PowerBallArray[4] = (ageOfPet + twoDigitModelYear)%66+1;
						  PowerBallArray[5] = (jerseyNumber*anArray[2])%66+1;
						  System.out.println("Lottery Numbers" + ": " + PowerBallArray[0] + ", " + PowerBallArray[1] + ", " + PowerBallArray[2] + ", " + PowerBallArray[3] + ", " + PowerBallArray[4] + "  Magic Ball: " + PowerBallArray[5]);
						  System.out.println("Would you like to generate another set of numbers? ");
						  String generateAnotherSet = scanner.nextLine();
						  if(generateAnotherSet.equals(s) || generateAnotherSet.equals(b)) {
							  continue;
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
