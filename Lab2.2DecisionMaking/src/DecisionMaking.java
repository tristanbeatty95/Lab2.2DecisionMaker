import java.util.Scanner;

public class DecisionMaking {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scan.nextLine();
	System.out.println("Please enter a number between 1 and 100");
	int input = scan.nextInt();
	if (input % 2 == 1 && input <= 60) {
		System.out.println(name + ", you entered " + input + " which is an odd number.");
	} else if (input % 2 == 0 && input >= 2 && input <= 25) {
		System.out.println("Even and less than 25.");
	} else if (input % 2 == 0 && input >= 26 && input <= 60) {
		System.out.println("Even");
	} else if (input % 2 == 0 && input > 60 && input < 100) {
		System.out.println(name + ", you entered " + input + " which is an even number");
	} else if (input % 2 == 1 && input > 60 && input < 100) {
		System.out.println(name + ", you entered " + input + " which is an Odd number over 60");
	} else if (input > 100 || input < 1) {
		System.out.println("Stop being silly, " + name + ". Please enter a valid number between 1-100");
	}
}
}
