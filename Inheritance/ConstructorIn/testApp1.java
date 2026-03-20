package Inheritance.ConstructorIn;

public class testApp1 {
    testApp1(){
        System.err.println("TestApp : Default Constructor");
    }
    public static void main(String[] args) {
        System.err.println("Start : Main Method");

        C obj = new C(100, 200, 300);

        System.err.println("no1 : " + obj.no1);
        System.err.println("no2 : " + obj.no2);
        System.err.println("no3 : " + obj.no3);

        System.err.println("End : Main Method");
    }
}
