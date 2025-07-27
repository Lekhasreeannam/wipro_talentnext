package oops_inheritance;
import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string: ");
			String input = scanner.nextLine();
			if (!input.isEmpty() && input.charAt(0) == 'x') {
			    input = input.substring(1);
			}
			if (!input.isEmpty() && input.charAt(input.length() - 1) == 'x') {
			    input = input.substring(0, input.length() - 1);
			}
			System.out.println("Result: " + input);
		}
	}

}
