package java_fundamentals;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int s=0;
			int o=n;
			while(n>0) {
				int digit=n%10;
				s=s*10+digit;
				n=n/10;
				
			}
			if(o==s) {
				System.out.print("Palindrome");
			}
			else {
				System.out.print("Not a Palindrome");
			}
		}

	}

}
