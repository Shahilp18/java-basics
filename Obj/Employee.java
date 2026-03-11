package Obj;

import java.util.Scanner;

public class Employee {
    int id;
	String name;
	int salary;
	String designation;
	String departmentName;

    public void scanData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name= sc.nextLine();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
        System.out.println("Enter Designation: ");
        designation = sc.nextLine();
        System.out.println("Enter Department: ");
        departmentName = sc.nextLine();

        sc.close();
    }
    public void displayData(){
        
        System.out.println(id + " " + name + " " + salary + " " + designation + " " + departmentName);
    }
}

