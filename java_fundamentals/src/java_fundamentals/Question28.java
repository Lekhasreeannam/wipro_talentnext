package java_fundamentals;
import java.util.Scanner;
public class Question28 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
			}
			System.out.print("{");
			
			for(int i=1;i<n;i++) {
				if(numbers[i]!=numbers[i-1] ) {
					System.out.print(numbers[i]+ ",");
				}
			}
		}
		System.out.print("}");
		

	}

}
