package java_fundamentals;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			char ch=s.next().toUpperCase().charAt(0);
			switch(ch) {
			case 'R':
				System.out.print("Red");
				break;
			case 'B':
				System.out.print("Blue");
				break;
			case 'G':
				System.out.print("Green");
				break;
			case 'O':
				System.out.print("Orange");
				break;
			case 'Y':
				System.out.print("Yellow");
				break;
			case 'W':
				System.out.print("White");
				break;
			default:
				System.out.print("Invalid");
			}
		}

	}

}
