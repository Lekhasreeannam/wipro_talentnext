package java_fundamentals;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			if(a>0) {
				System.out.println("Positive");
			}
			else if(a<0) {
				System.out.println("Negative");
			}
			else {
				System.out.println("Zero");
			}
		}

	}

}
