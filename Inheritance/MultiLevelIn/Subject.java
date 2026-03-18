package Inheritance.MultiLevelIn;

import java.util.Scanner;

public class Subject extends Student{
    //! MultiLevel Inheritance
    String subject;

    public void scanData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No : ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter Std : ");
        std = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Subject : ");
        subject = sc.nextLine();
        System.out.println("Enter Marks : ");
        marks = sc.nextInt();
        sc.close();
    }

    public void displayData(){
        System.out.println(rno + " " + name + " " + std + " " + subject + " " + marks);
    }

    public static void main(String[] args) {
        Subject s1 = new Subject();

        s1.scanData();
        s1.displayData();
    }
}
