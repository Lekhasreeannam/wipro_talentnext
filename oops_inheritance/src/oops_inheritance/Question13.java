package oops_inheritance;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			String result;
			if (input.length() > 2) {
			    result = input.substring(1, input.length() - 1);
			} else {
			    result = ""; 
			}
			System.out.println("Result: " + result);
		}
	}

}
