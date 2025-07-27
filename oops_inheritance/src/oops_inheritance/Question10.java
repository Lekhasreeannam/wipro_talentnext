package oops_inheritance;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			int length = input.length();
			String result = "";
			String firstTwo = input.length() < 2 ? input : input.substring(0, 2);
			for (int i = 0; i < length; i++) {
			    result += firstTwo;
			}
			System.out.println("Result: " + result);
		}
	}

}
