package Obj;
import java.util.Scanner;

public class Student{
    //! Data Members
    private int rno,std,marks;
    private String name;


    //! Default Constructor
    public Student(){
        System.out.println("== Student :: Start Default Constructor===" + this);

        System.out.println("Before Constructor Initialization : "+rno + " " + name + " " + std + " " + marks);

        rno = 101;
        name = "Shahil";
        std = 12;
        marks = 100;
        System.out.println("After Constructor Initialization : "+rno + " " + name + " " + std + " " + marks);
        System.out.println("== Student :: Exit Default Constructor===" + this);
    }

    //! Parameterised Constructor
    public Student(int r, String n, int s, int m){
        System.out.println("== Student :: Start Parameterised Constructor===" + this);

        System.out.println("Before Constructor Initialization : "+rno + " " + name + " " + std + " " + marks);

        rno = r;
        name = n;
        std = s;
        marks = m;
        System.out.println("After Constructor Initialization : "+rno + " " + name + " " + std + " " + marks);
        System.out.println("== Student :: Exit Parameterised Constructor===" + this);
    }

    //! Parameterised Constructor(3 Arguments)
    public Student(int r, String n, int s){
        System.out.println("== Student :: Start 3 Parameterised Constructor===" + this);

        System.out.println("Before Constructor Initialization : "+rno + " " + name + " " + std);

        rno = r;
        name = n;
        std = s;

        System.out.println("After Constructor Initialization : "+rno + " " + name + " " + std);
        System.out.println("== Student :: Exit 3 Parameterised Constructor===" + this);
    }

    //! Copy Constructor
    public Student(Student s){
        System.out.println("== Student :: Start Copy Constructor===" + this);

        System.out.println("Before Constructor Initialization : "+rno + " " + name + " " + std + " " + marks);

        rno = s.rno;
        name = s.name;
        std = s.std;
        marks = s.marks;
        System.out.println("After Constructor Initialization : "+rno + " " + name + " " + std + " " + marks);
        System.out.println("== Student :: Exit Copy Constructor===" + this);
    }


    //! Member Function(Optional)
    public void scanData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No: ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name: ");
        name= sc.nextLine();
        System.out.println("Enter Std: ");
        std = sc.nextInt();
        System.out.println("Enter Marks: ");
        marks = sc.nextInt();

        sc.close();
    }

    //! getters and setters
    public void setRno(int r){
        rno = r;
    }
    public void setStd(int s){
        std = s;
    }
    public void setmarks(int m){
        marks = m;
    }
    public void setName(String n){
        name = n;
    }

    public int getRno(){
        return rno;
    }
    public String getName(){
        return name;
    }
    public int getStd(){
        return std;
    }
    public int getMarks(){
        return marks;
    }

    public void displayData(){
        
        System.out.println(rno + " " + name + " " + std + " " + marks);
    }
}
