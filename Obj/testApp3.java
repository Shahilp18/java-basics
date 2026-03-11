package Obj;
import java.util.Scanner;

public class testApp3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No: ");
        int rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name= sc.nextLine();
        System.out.println("Enter Std: ");
        int std = sc.nextInt();
        System.out.println("Enter Marks: ");
        int marks = sc.nextInt();

        // Student s = new Student();

        // s.setRno(rno);
        // s.setName(name);
        // s.setStd(std);
        // s.setmarks(marks);

        System.out.println(rno + " " + name + " " + std + " " + marks);
        sc.close();
    }
}
