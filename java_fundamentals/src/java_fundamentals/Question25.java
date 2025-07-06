package java_fundamentals;
import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int asciiValues[]=new int[n];
			for(int i=0;i<n;i++) {
				asciiValues[i]=s.nextInt();
				
			}
			for(int value: asciiValues) {
				System.out.print((char ) value);
			}
		}
		

	}

}
