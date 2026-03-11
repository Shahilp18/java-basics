package Obj;
import java.util.Scanner;

public class testStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("S1===>" +s1);
        System.out.println("S2===>" +s2);
        System.out.println("S3===>" +s3);

        // s1.scanData();
        // s2.scanData();
        // s3.scanData();
        
        // s1.displayData();
        // s2.displayData();
        // s3.displayData();
        
        sc.close();
    }
}
