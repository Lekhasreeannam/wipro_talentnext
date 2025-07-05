package java_fundamentals;
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char ch=s.next().charAt(0);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
				System.out.print("Alphabet");
			}
			else if(ch>=0 && ch<=9) {
				System.out.print("Digit");
			}
			else {
				System.out.print("Special Character");
			}
		}
		

	}

}
