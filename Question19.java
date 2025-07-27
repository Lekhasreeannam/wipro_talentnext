package oops_inheritance;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringJoiner;

public class Question19 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter number of names: ");
			int n = scanner.nextInt();
			scanner.nextLine();
			ArrayList<String> names = new ArrayList<>();
			for (int i = 0; i < n; i++) {
			    System.out.print("Enter name " + (i + 1) + ": ");
			    names.add(scanner.nextLine());
			}
			StringJoiner joiner = new StringJoiner(",", "{", "}");

			for (String name : names) {
			    joiner.add(name);
			}
			System.out.println("Joined names: " + joiner.toString());
		}
	}

}
