package java_fundamentals;

import java.util.Scanner;

public class Miniproject {
    public static void main(String[] args) {
       
        int[] empId = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Ranjan", "Ranjan", "Ritu", "Rahul"};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < empId.length; i++) {
            if (empId[i] == id) {
                found = true;

                String designation = "";
                int da = 0;

                
                switch (designationCode[i]) {
                    case 'e':
                        designation = "Engineer";
                        da = 20000;
                        break;
                    case 'c':
                        designation = "Consultant";
                        da = 32000;
                        break;
                    case 'k':
                        designation = "Clerk";
                        da = 12000;
                        break;
                    case 'r':
                        designation = "Receptionist";
                        da = 15000;
                        break;
                    case 'm':
                        designation = "Manager";
                        da = 40000;
                        break;
                    default:
                        designation = "Unknown";
                        da = 0;
                        break;
                }

                int salary = basic[i] + hra[i] + da - it[i];

                System.out.println("Emp No Emp Name Department Designation Salary");
                System.out.printf("%-7d %-9s %-11s %-12s %d\n", empId[i], empName[i], department[i], designation, salary);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }

        sc.close();
    }
}
