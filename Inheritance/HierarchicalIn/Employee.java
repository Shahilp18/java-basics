package Inheritance.HierarchicalIn;

import java.util.Scanner;

public class Employee extends Person{
    int id, salary;
    String department, orgName;

    public void scanData(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ID : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Salary : ");
        salary = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department : ");
        department = sc.nextLine();
        System.out.println("Enter Organisation : ");
        orgName = sc.nextLine();
        // sc.close();
    }
    public void displayData(){
        System.out.println(id + " " + name + " " + salary + " " + department + " " + orgName);
    }
}
