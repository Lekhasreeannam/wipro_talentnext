package java_fundamentals;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String gender=s.nextLine().trim();
			int age=s.nextInt();
			if(gender.equalsIgnoreCase("Female")) {
				if(age>=1 && age<=58) {
					System.out.println("interest is 8.2%");
				}
				else if(age>=59 && age<=100) {
					System.out.println("interest is 9.2%");
				}
				else {
					System.out.println("Invalid age");
				}
			}
			else if(gender.equalsIgnoreCase("Male")) {
				if(age>=1 && age<=58) {
					System.out.println("interest is 8.4%");
				}
				else if(age>=59 && age<=100) {
					System.out.println("interest is 10.5%");
				}
				else {
					System.out.println("Invalid age");
				}
			}
			else {
				System.out.println("Invalid");
			}
		}

	}

}
