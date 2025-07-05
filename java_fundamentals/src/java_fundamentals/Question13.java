package java_fundamentals;
import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int month=s.nextInt();
			if(month==0) {
				System.out.print("Please enter the month in number");
			}
			else {
				switch(month) {
				case 1:
					System.out.print("January");
					break;
				case 2:
					System.out.print("February");
					break;
				case 3:
					System.out.print("March");
					break;
				case 4:
					System.out.print("April");
					break;
				case 5:
					System.out.print("May");
					break;
					
				case 6:
					System.out.print("June");
					break;
				case 7:
					System.out.print("July");
					break;
				case 8:
					System.out.print("August");
					break;
				case 9:
					System.out.print("September");
					break;
				case 10:
					System.out.print("October");
					break;
				case 11:
					System.out.print("November");
					break;
				case 12:
					System.out.print("December");
					break;
				
				default:
					System.out.print("Invalid month");
					break;
				}
				
			}
		}

	}

}
