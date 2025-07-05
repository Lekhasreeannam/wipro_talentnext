package java_fundamentals;
import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int numbers[]=new int[n];
			int searchNumber=sc.nextInt();
			int index=-1;
			for(int i=0;i<n;i++) {
				numbers[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				if (numbers[i]==searchNumber) {
					index=i;
				}
			}
			System.out.println(index);
		}

	}

}
