package Array;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a[][] = new int [2][2];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.println("Enter A["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}

