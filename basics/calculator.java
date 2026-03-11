package basics;
import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int no1, no2, ans;
        
        System.out.println("Enter No1: ");
        no1 = sc.nextInt();

        System.out.println("Enter No2: ");
        no2 = sc.nextInt();
        
        System.out.println("No1: " + no1);
        System.out.println("No2: " + no2);
        System.out.println("------------------------");
        ans = no1 + no2;
        System.out.println("Addition: " + ans);

        ans = no1 - no2;
        System.out.println("Subtraction: " + ans);

        ans = no1 * no2;
        System.out.println("Multiplication: " + ans);

        ans = no1 / no2;
        System.out.println("Division: " + ans);

        sc.close();
    }
}
