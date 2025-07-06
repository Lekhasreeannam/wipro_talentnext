package java_fundamentals;
import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			int result[]= new int[n];
			int j=0;
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
			}
			for(int i=0;i<n;i++) {
				if(numbers[i]%2==0) {
					result[j]=numbers[i];
					j++;
				}
			}
			for(int i=0;i<n;i++) {
				if(numbers[i]%2!=0) {
					result[j]=numbers[i];
					j++;
				}
			}
			for(int value:result) {
				System.out.print(value+ " ");
			}
		}

	}

}
