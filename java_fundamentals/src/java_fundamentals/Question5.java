package java_fundamentals;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			int last1=a%10;
			int last2=a%10;
			if(last1==last2) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}

	}

}
