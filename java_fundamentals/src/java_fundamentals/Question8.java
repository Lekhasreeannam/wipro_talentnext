package java_fundamentals;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char a=s.next().charAt(0);
			char b=s.next().charAt(0);
			if(a>b) {
				System.out.print(a+ "," +b);
			}
			else {
				System.out.print(b+ "," +a);
			}
		}
		

	}

}
