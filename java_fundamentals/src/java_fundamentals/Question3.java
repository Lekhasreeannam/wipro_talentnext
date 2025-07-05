package java_fundamentals;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			int b=s.nextInt();
			int c=a+b;
			System.out.println("The sum of " +a+ " and " +b+ " is " +c);
		}

	}

}
