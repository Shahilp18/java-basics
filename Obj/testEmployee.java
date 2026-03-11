package Obj;

import java.util.Scanner;

public class testEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        System.out.println("E1===>" +e1);
        System.out.println("E2===>" +e2);
        System.out.println("E3===>" +e3);

        e1.scanData();
        e2.scanData();
        e3.scanData();
        
        e1.displayData();
        e2.displayData();
        e3.displayData();
        
        sc.close();
    }
}
