package oops_inheritance;
class Fruit {
 String name;
 String taste;
 String size;
 public Fruit(String name, String taste, String size) {
     this.name = name;
     this.taste = taste;
     this.size = size;
 }
 public void eat() {
     System.out.println("The fruit " + name + " tastes " + taste + ".");
 }
}
class Apple extends Fruit {
 public Apple(String size) {
     super("Apple", "sweet and crispy", size);
 }
 public void eat() {
     System.out.println("The " + name + " is " + size + " and tastes " + taste + ".");
 }
}
class Orange extends Fruit {
 public Orange(String size) {
     super("Orange", "citrusy and tangy", size);
 }
 public void eat() {
     System.out.println("The " + name + " is " + size + " and tastes " + taste + ".");
 }
}
public class Question6{
 public static void main(String[] args) {
     Fruit apple = new Apple("medium");
     Fruit orange = new Orange("small");

     apple.eat();
     orange.eat();
 }
}
