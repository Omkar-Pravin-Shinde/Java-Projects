import java.util.Scanner;

class FarmerLaunch{


    int la;
    float tr;
    static float intrest;
    float si;

    static{
        intrest = 8.9f;
                            // we use static because when we call same verible which is constant then non static create multiple obj of it 
                            // and staic create only one obj then our memory use reduce which help this in lager projects....
    }


    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount: " );
        la = scan.nextInt();
        System.out.println("Enter timen duration: ");
        tr = scan.nextFloat();

    }

    void compute()
    {
        si = (la*tr*intrest)/100f;
    }

    void display()
    {
        System.out.println("Total simple intersest is: "+si);
    }
}



public class Farmer {
    public static void main(String[] args) {
        FarmerLaunch f1 = new FarmerLaunch();

        f1.input();
        f1.compute();
        f1.display();

        FarmerLaunch f2 = new FarmerLaunch();
        f2.input();f2.compute();f2.display();

    }
}
