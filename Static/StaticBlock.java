/**
 * StaticBlock
 */
public class StaticBlock {

    static int a =100;
    static{
        System.out.println(a);
        System.out.println("omkar");
    }

    static{
        System.out.println("Static block 2");
    }


{
    int a =10;
    int b= 20;
    System.out.println("Instance block");
}


    static void disp()
    {
        System.out.println("this is static mathod");
    }
    public static void main(String[] args) {
        StaticBlock s =new StaticBlock();

System.out.println("main block");
disp();
    }
}