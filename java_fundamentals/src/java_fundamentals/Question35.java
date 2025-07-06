package java_fundamentals;
import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		try (
		Scanner s = new Scanner(System.in)) {
			int numbers[][]=new int[3][3];
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++) {
			        
			            numbers[i][j] = s.nextInt();
			            
			        
			    }
			    
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(numbers[i][j]+" ");
				}
				System.out.println();
			}
			int max = numbers[0][0];
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++) {
			        if (numbers[i][j] > max) {
			            max = numbers[i][j];
			        }
			    }
			}
			System.out.println("\nThe biggest number in the given array is " + max);
		}
		

	}

}
