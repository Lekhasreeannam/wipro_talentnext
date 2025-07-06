package java_fundamentals;
import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			boolean only14=true;
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
				if(numbers[i]!=1 && numbers[i]!=4) {
					only14=false;
				}
			}
			System.out.print(only14);
		}
		
	}

}
