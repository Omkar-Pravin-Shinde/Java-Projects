class Countries {
    void dis() {
        System.out.println(" Contires class ");
    }

    void Cou() {
        System.out.println("This is All COuntires");

    }
}

class India extends Countries {
    void Cou() { // This is Overriden CLass As we make changes in Content
        System.out.println("This is India");

    }

    void print() { // This is Specialized class as this is not inherited form Parent
        System.out.println("India is Best");  
    }
    // void dip(){ //This is Inherited class as there no change in content

    // }
}

class USA extends Countries {
    void Cou() {
        System.out.println("This is USA");

    }
}

public class Method {
    public static void main(String[] args) {
        India I = new India();
        I.dis();
        I.Cou();
        I.print();

        USA U = new USA();
        U.dis();
        U.Cou();
        
    }
}
