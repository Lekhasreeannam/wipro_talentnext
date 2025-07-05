package java_fundamentals;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String a=s.nextLine().trim();
			if(a.isEmpty()) {
				System.out.println("No Values");
			}
			else {
				String[] values=a.split("\\s+");
				for(int i=0;i<values.length;i++) {
					System.out.print(values[i]);
					if(i!=values.length-1) {
						System.out.print(",");
					}
				}
			}
		}
		
		
		
		
		
	}

}
	
