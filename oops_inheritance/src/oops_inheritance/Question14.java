package oops_inheritance;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter first string: ");
			String a = scanner.nextLine();
			System.out.print("Enter second string: ");
			String b = scanner.nextLine();
			String result;
			if (a.length() < b.length()) {
			    result = a + b + a;
			} else {
			    result = b + a + b;
			}
			System.out.println("Result: " + result);
		}
	}

}
