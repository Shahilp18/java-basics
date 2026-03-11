package Obj;
import java.util.Scanner;

public class testStudent2 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        Student s[] = new Student[2];
    
        for(int i = 0; i < s.length; i++){
            s[i] = new Student();
            // s[i].scanData();
        }
    
        for(int i = 0; i < s.length; i++){
            // s[i].displayData();
        }
        sc.close();
    }
}
