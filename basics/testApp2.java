package basics;

import java.util.Scanner;

public class testApp2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        // String name = sc.next();
        String name2 = sc.nextLine();

        System.out.println("Name: "+ name2);
        sc.close();
    }
}   