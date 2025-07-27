package oops_inheritance;
class Shape {
 void draw() {
     System.out.println("Drawing Shape");
 }

 void erase() {
     System.out.println("Erasing Shape");
 }
}
class Circle extends Shape {
 void draw() {
     System.out.println("Drawing Circle");
 }
 void erase() {
     System.out.println("Erasing Circle");
 }
}
class Triangle extends Shape {
 void draw() {
     System.out.println("Drawing Triangle");
 }
 void erase() {
     System.out.println("Erasing Triangle");
 }
}
class Square extends Shape {
 void draw() {
     System.out.println("Drawing Square");
 }
 void erase() {
     System.out.println("Erasing Square");
 }
}
public class Question7 {
 public static void main(String[] args) {
     Shape c = new Circle();     // Polymorphic object
     Shape t = new Triangle();   // Polymorphic object
     Shape s = new Square();     // Polymorphic object

     System.out.println("Circle:");
     c.draw();
     c.erase();

     System.out.println("\nTriangle:");
     t.draw();
     t.erase();

     System.out.println("\nSquare:");
     s.draw();
     s.erase();
 }
}

