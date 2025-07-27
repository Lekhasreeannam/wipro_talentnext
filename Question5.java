package oops_inheritance;
import java.util.Scanner;
class Person {
 private String name;
 public Person() {
 }
 public Person(String name) {
     this.name = name;
 }
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }
}
class Employee extends Person {
 private double annualSalary;
 private int yearStarted;
 private String insuranceNumber;
 public Employee() {
 }
 public Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {
     super(name);
     this.annualSalary = annualSalary;
     this.yearStarted = yearStarted;
     this.insuranceNumber = insuranceNumber;
 }

 
 public double getAnnualSalary() {
     return annualSalary;
 }

 public void setAnnualSalary(double annualSalary) {
     this.annualSalary = annualSalary;
 }

 public int getYearStarted() {
     return yearStarted;
 }

 public void setYearStarted(int yearStarted) {
     this.yearStarted = yearStarted;
 }

 public String getInsuranceNumber() {
     return insuranceNumber;
 }

 public void setInsuranceNumber(String insuranceNumber) {
     this.insuranceNumber = insuranceNumber;
 }

 
 public void displayEmployeeDetails() {
     System.out.println("Name: " + getName());
     System.out.println("Annual Salary: ₹" + annualSalary);
     System.out.println("Year Started: " + yearStarted);
     System.out.println("Insurance Number: " + insuranceNumber);
 }
}


public class Question5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter employee name: ");
			String name = sc.nextLine();

			System.out.print("Enter annual salary: ");
			double salary = sc.nextDouble();

			System.out.print("Enter year the employee started: ");
			int yearStarted = sc.nextInt();
			sc.nextLine(); 

			System.out.print("Enter national insurance number: ");
			String insuranceNumber = sc.nextLine();

			
			Employee emp = new Employee(name, salary, yearStarted, insuranceNumber);

			
			System.out.println("\n--- Employee Details ---");
			emp.displayEmployeeDetails();
		}
	}

}
