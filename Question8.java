package oops_inheritance;
import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String input=s.nextLine();
			String str=input.toLowerCase();
			boolean isPalindrome=true;
			int length=str.length();
			for(int i=0;i<length/2;i++) {
				if (str.charAt(i) != str.charAt(length - i - 1)) {
					isPalindrome=false;
					
				}
			}
			if(isPalindrome) {
				System.out.println("palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
		}
	}

}
