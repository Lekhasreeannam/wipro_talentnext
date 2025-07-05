package java_fundamentals;
import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			boolean s=true;
			if(n<=1) {
				s=false;
			}
			else {
				for(int i=2;i<=Math.sqrt(n);i++) {
					if(n%i==0) {
						s=false;
						break;
					}
				}
					
				
			}
			
			if(s) {
				System.out.print("prime");
			}
			else {
				System.out.print("not a prime");
			}
		}
			

	}

}
