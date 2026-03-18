package Inheritance.HierarchicalIn;

public class testApp1 {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.scanData();
        e1.displayData();

        System.out.println("----------------------");
        Student s1 = new Student();
        s1.scanData();
        s1.displayData();
    }
}
