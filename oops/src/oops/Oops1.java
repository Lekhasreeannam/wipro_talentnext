package oops;
import java.util.Scanner;

class Box {
    double width, height, depth;

    
    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    
    public double getVolume() {
        return width * height * depth;
    }

public class Oops1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        double w = scanner.nextDouble();

        
        double h = scanner.nextDouble();

        
        double d = scanner.nextDouble();

        
        Box myBox = new Box(w, h, d);

        
        System.out.println("Volume of the box: " + myBox.getVolume());

        scanner.close();
    }
	}

}
