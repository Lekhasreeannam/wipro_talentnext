package oops_inheritance;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String first = scanner.nextLine().toLowerCase();
			String second = scanner.nextLine().toLowerCase();
			if (!first.isEmpty() && !second.isEmpty() &&
			    first.charAt(first.length() - 1) == second.charAt(0)) {
			    second = second.substring(1); // Remove one of the repeated characters
			}
			String result = first + " " + second;
			System.out.println(result);
		}
	}

}
