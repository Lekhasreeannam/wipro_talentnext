package oops_inheritance;
import java.util.Scanner;
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Bird extends Animal {
    void eat() {
        System.out.println("Bird pecks at seeds and eats...");
    }
    void sleep() {
        System.out.println("Bird sleeps in its nest...");
    }

    void fly() {
        System.out.println("Bird is flying high in the sky...");
    }
}

public class Question4 {
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
            Animal animal = new Animal();
	        System.out.println("Calling methods from Animal class:");
	        animal.eat();
	        animal.sleep();

	        System.out.println();
	        Bird bird = new Bird();
	        System.out.println("Calling methods from Bird class:");
	        bird.eat();
	        bird.sleep();
	        bird.fly();

	        sc.close();

	}

}
