package oops_inheritance;
import java.util.Scanner;
import java.util.StringJoiner;

public class Question20 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter number of cities in list 1: ");
			int n1 = scanner.nextInt();
			scanner.nextLine();
			StringJoiner s1 = new StringJoiner("-", "[", "]");
			System.out.println("Enter " + n1 + " cities for list 1:");
			for (int i = 0; i < n1; i++) {
			    s1.add(scanner.nextLine());
			}
			System.out.print("Enter number of cities in list 2: ");
			int n2 = scanner.nextInt();
			scanner.nextLine();
			StringJoiner s2 = new StringJoiner("-", "[", "]");
			System.out.println("Enter " + n2 + " cities for list 2:");
			for (int i = 0; i < n2; i++) {
			    s2.add(scanner.nextLine());
			}
			StringJoiner s2MergedWithS1 = new StringJoiner("-", "[", "]");
			s2MergedWithS1.merge(s2);
			s2MergedWithS1.merge(s1);
			StringJoiner s1MergedWithS2 = new StringJoiner("-", "[", "]");
			s1MergedWithS2.merge(s1);
			s1MergedWithS2.merge(s2);
			System.out.println("\ni) s1 merged to s2: " + s2MergedWithS1);
			System.out.println("ii) s2 merged to s1: " + s1MergedWithS2);
		}
	}

}
