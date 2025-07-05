package java_fundamentals;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String a=s.nextLine();
			System.out.println("Welcome "+a);
		}

	}

}
