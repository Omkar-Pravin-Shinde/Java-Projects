class Human  //Super class, Base class, Parent class
{
    int age=18;
    Human()
    {
                System.out.println("This  is constructor of Human class");

    }
    void sleep()
    {
        System.out.println(age);
        System.out.println("Zzz...");
    }
}

class student extends Human   //Subclass, Derived class, Child class
{
    // student(){
    //     super();     //calling the parent's (Human)'s default Constructor
    // }
    void try1(){
    System.out.println(age);
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        student stu = new student();
        stu.sleep();
        stu.try1();
        
    }
    
}