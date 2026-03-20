package Inheritance.ConstructorIn;

public class C extends B{
    int no3;
    C(int no1,int no2,int no3){
        // System.err.println(C : Default Constructor);

        super(no1, no2);
        this.no3 = no3;
}

}