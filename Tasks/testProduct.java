package Tasks;
import java.util.Scanner;

public class testProduct {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", "Dell", 55000, 10);
        Product p3 = new Product(p1);

        p1.displayData();
        p2.displayData();
        p3.displayData();
    }
    
}
