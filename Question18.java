package oops_inheritance;
import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			System.out.print("Enter an integer (n): ");
			int n = scanner.nextInt();
			if (n < 0 || n > input.length()) {
			    System.out.println("Invalid input: n must be between 0 and the length of the string.");
			} else {
			    String lastN = input.substring(input.length() - n);
			    StringBuilder result = new StringBuilder();

			    for (int i = 0; i < n; i++) {
			        result.append(lastN);
			    }
			    System.out.println("Result: " + result.toString());
			}
		}
	}

}
