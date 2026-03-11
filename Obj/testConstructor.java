package Obj;
import java.util.Scanner;

public class testConstructor {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student(102, "Krish", 12, 90);
        
        s1.displayData();
        s2.displayData();
    }

}
