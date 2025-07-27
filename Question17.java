package oops_inheritance;
import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter first string: ");
			String a = scanner.nextLine();

			System.out.print("Enter second string: ");
			String b = scanner.nextLine();

			StringBuilder result = new StringBuilder();

			int maxLength = Math.max(a.length(), b.length());

			for (int i = 0; i < maxLength; i++) {
			    if (i < a.length()) {
			        result.append(a.charAt(i));
			    }
			    if (i < b.length()) {
			        result.append(b.charAt(i));
			    }
			}
			System.out.println("Result: " + result.toString());
		}
	}

}
