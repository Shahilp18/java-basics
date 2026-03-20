package Inheritance.ConstructorIn;

public class B extends A {
    int no2;
    B(int no1,int no2){
        // System.err.println("B :  Default Constructor");
        super(no1);
        this.no2 = no2;
    }
}
