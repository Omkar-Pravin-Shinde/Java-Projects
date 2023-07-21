
/*
 * the shadowing problem states that, if both loacl and instance variable have 
 * same name inside method then it could result in name clash and jvm give prefernce to loacl veraible
 * 
 */




class demo{

    String name;
    int roll;

    void setdata(String name, int roll)
    {
        this.name = name;               //So this keyword help us to give valuse of local variable to instance variable 
        this.roll = roll;               // without creating new object........

    }

    void print()
    {
        System.out.println(name+" "+roll);
    }

}


public class Shadowing {
    public static void main(String[] args) {
        demo d =new demo();
        d.setdata("omkar", 20);
        d.print();
        demo d1 =new demo();
        d1.setdata("Bhushan", 25);
        d1.print();
    }
}
