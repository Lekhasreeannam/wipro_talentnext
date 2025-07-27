package oops_inheritance;
import java.util.Scanner;
class Box{
	double width;
	double height;
	double depth;
	
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	
	
}
	double getVolume() {
		return width*height*depth;
	}

}

public class OopsQuestion1 {

	public static void main(String[] args) {
		
		
		try (Scanner s = new Scanner(System.in)) {
			double width=s.nextDouble();
			double height=s.nextDouble();
			double depth=s.nextDouble();
			Box myBox=new Box(width ,height ,depth );
			System.out.println(myBox.getVolume());
		}
			
				
				
				
		
		

	}

}
