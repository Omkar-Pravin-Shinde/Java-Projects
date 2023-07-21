class demo1{


    // int a =10;
    static void displ1()
    {
        int b =10;
        System.out.println(b);    //this not allowed beacuse non static veriable initialize in memory during object creation but 
                                //  static method get called before it 
    }
}

public class StaticMethInstanVer {
    
    
    
    
    public static void main(String[] args) {
        demo1 d = new demo1();
        demo1.displ1();
    }
}
