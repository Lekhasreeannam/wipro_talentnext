package java_fundamentals;
import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			int res[]=new int[n];
			int j=0;
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
				if(numbers[i]!=10) {
					res[j]=numbers[i];
					j++;
				}
				
			}
			for(int value:res) {
				System.out.print(value+ " ");
			}
		}
		
		

	}

}
