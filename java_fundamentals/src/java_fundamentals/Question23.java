package java_fundamentals;
import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		extracted();
		
		

	}

	private static void extracted() {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
				
			}
			int max=numbers[0];
			int min=numbers[0];
			for(int i=1;i<n;i++) {
				if(numbers[i]>max) {
					max=numbers[i];
					
					
				}
				if(numbers[i]<min) {
					min=numbers[i];
					
					
				}
			}
			System.out.println(max);
			System.out.print(min);
		}
	}

}
