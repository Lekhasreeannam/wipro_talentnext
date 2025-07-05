package java_fundamentals;
import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char ch=s.next().charAt(0);
			if(ch>='a' && ch<='z') {
				char upper=Character.toUpperCase(ch);
				System.out.print(upper);
			}
			else if(ch>='A' && ch<='Z') {
				char lower=Character.toLowerCase(ch);
				System.out.println(lower);
			}
		}

	}

}
