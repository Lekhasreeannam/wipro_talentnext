package java_fundamentals;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			if(a%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}

	}

}
