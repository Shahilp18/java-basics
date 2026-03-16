package Obj;
import java.util.Scanner;

public class testConstructor {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Student s1 = new Student(); //! Default
        Student s2 = new Student(102, "Krish", 12, 90); //! Parameterised
        Student s3 = new Student(103, "Sanket", 12); //! Parameterised (3 args)
        Student s4 = new Student(s1); //! Copy
        
        s1.displayData();
        s2.displayData();
        s3.displayData();
        s4.displayData();
    }

}
