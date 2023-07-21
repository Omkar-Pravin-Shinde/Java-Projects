
class animal
{
    void disp()
    {
        System.out.println("THis is Animal");
    }
}
class Dog extends animal
{

}
class Cat extends animal
{

}
class Tiger extends animal
{

}
class TIger1 extends Tiger
{

}
class Tiger2 extends Tiger
{

}


public class Hirarchical {
    public static void main(String[] args) {
        Tiger2 t2 = new Tiger2();
        t2.disp();

    }
}
