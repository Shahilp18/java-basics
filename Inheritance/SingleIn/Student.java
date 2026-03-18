package Inheritance.SingleIn;

import java.util.Scanner;

public class Student extends Person {
    int rno;
    int std;
    int marks;

    public void scanData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No : ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Std : ");
        std = sc.nextInt();
        System.out.println("Enter Marks : ");
        marks = sc.nextInt();
        sc.close();
    }

    public void displayData(){
        System.out.println(rno + " " + name + " " + std + " " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.scanData();
        s1.displayData();
    }
}
