package java_fundamentals;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[][]arr=new int[2][2];
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=1;i>=0;i--) {
				for(int j=1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}