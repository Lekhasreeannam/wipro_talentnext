package java_fundamentals;
import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int[] numbers=new int[n];
			int sum=0;
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
				sum=sum+numbers[i];
			}
			double average=(double) sum/n; 
			System.out.println(sum);
			System.out.println(average);
		}
		

	}
	

}
