package java_fundamentals;
import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a[]=new int[3];
			int b[]=new int[3];
			for(int i=0;i<3;i++) {
				a[i]=s.nextInt();
			}
			for(int i=0;i<3;i++) {
				b[i]=s.nextInt();
			}
			int result[]= {a[1],b[1]};
			System.out.print(result[0]+ "," +result[1]);
		}

	}

}
