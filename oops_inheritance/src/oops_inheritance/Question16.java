package oops_inheritance;
import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();

			StringBuilder result = new StringBuilder();

			for (int i = 0; i < input.length(); i++) {
			    if (input.charAt(i) == '*'
			        || (i > 0 && input.charAt(i - 1) == '*')
			        || (i < input.length() - 1 && input.charAt(i + 1) == '*')) {
			        continue;
			    }

			    result.append(input.charAt(i));
			}
			System.out.println("Result: " + result.toString());
		}
	}

}
