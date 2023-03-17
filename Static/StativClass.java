

class demo{

    void disp1()
    {
        System.out.println("Non static method");
    }
    void disp2()
    {
        System.out.println("THis is staic method");
    }
}




public class StativClass {
     
    public static void main(String[] args) {
        
        demo d = new demo();
        d.disp1();
        d.disp2();

    }
}
