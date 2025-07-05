package java_fundamentals;
import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			System.out.print(sum);
		}

	}

}
