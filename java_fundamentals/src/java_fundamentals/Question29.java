package java_fundamentals;
import java.util.Scanner;
public class Question29 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int numbers[]=new int[n];
			for(int i=0;i<n;i++) {
				numbers[i]=s.nextInt();
			}
			int sum=0;
			boolean inside67=false;
			for(int num:numbers) {
				if(num==6) {
					inside67=true;
				}
				else if(num==7 && inside67) {
					inside67=false;
				}
				else if(!inside67) {
					sum=sum+num;
				}
			}
			System.out.println(sum);
		}
		

	}

}
