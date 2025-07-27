package oops_inheritance;
import java.util.Scanner;
class Calculator{
	public static int powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,int num2) {
		return (double) Math.pow(num1, num2);
	}
}

public class OopsQuestion2 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(Calculator.powerInt(a,b));
			double x=s.nextDouble();
			int y=s.nextInt();
			System.out.println(Calculator.powerDouble(x, y));
		}
		
	}

}
