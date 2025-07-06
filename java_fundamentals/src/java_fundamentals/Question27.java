package java_fundamentals;
import java.util.Arrays;
import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
			}
			Arrays.sort(numbers);
			for(int value:numbers) {
				System.out.print(value+ " ");
			}
		}
		

	}

}
