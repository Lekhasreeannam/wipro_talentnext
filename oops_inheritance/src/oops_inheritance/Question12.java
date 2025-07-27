package oops_inheritance;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();

			String result;
			if (input.length() % 2 == 0) {
			    result = input.substring(0, input.length() / 2);
			} else {
			    result = null;
			}
			System.out.println("Result: " + result);
		}
	}

}
