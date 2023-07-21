
class demo1 {
    void display() {
        System.out.println("Demo1");
    }
}

class demo2 extends demo1 {
    void display() {
        System.out.println("Demo2");
    }
}

class demo3 extends demo2 {

}

public class Multilevel {
    public static void main(String[] args) {
        demo3 D = new demo3();
        D.display();
    }
}
