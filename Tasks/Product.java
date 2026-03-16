package Tasks;
// import java.util.Scanner; 

public class Product {  
        //! Data Members
        int productId, quantity;
        String productName, brand;
        float price;

    //! Default Constructor
    public Product(){
        System.out.println("== Default Constructor===" + this);
        productId = 0;
        productName = "Unknown";
        brand = "No Brand";
        price = 0;
        quantity = 0; 
    }

    //! Parameterised Constructor
    public Product(int i, String n, String b, float p, int q){
        System.out.println("== Parameterised Constructor===" + this);
        productId = i;
        productName = n;
        brand = b;
        price = p;
        quantity = q;
    }

    //! Copy Constructor
    public Product(Product p){
        System.out.println("== Copy Constructor===" + this);
        productId = p.productId;
        productName = p.productName;
        brand = p.brand;
        price = p.price;
        quantity = p.quantity;
    }

    //! Display Data
    public void displayData(){
        
        System.out.println(productId + " " + productName + " " + brand + " " + price + " " + quantity);
    }
}
