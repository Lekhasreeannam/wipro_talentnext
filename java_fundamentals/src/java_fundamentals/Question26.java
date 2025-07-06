package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
			}
			
			Arrays.sort(numbers);
			 System.out.println("Largest two numbers: " + numbers[n-1] + ", " +  numbers[n-2]);
			 System.out.println("Smallest two numbers: " + numbers[0] + ", " + numbers[1]);
		}
		

	}

}
