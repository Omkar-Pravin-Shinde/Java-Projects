import java.util.Scanner;

public class Loop {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // For loop
        // for(int i =0 ;i<5;i++)
        // {
            
        //     for(int j = 0 ; j<i;j++)
        //     {
        //     System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // omkar@omkar-VPCCB15FG:~/Documents/PWJava/Operators/Relational$  /usr/bin/env /usr/lib/jvm/java-11-openjdk-amd64/bin/java -cp /home/omkar/Documents/PWJava/Operators/Relational/bin Loop 

        // *
        // **
        // ***
        // ****

        // While Loop

        // int i =0;
        // while(i<5)
        // {
        //     System.out.println("*");
        //     i++;
        // }

        // Do while

        // int i =0;
        // do
        // {
        //     System.out.println("*");
        //     i++;

        // }while(i<5);

        for(int i=1;i<=12;i+=2)
        {
            if(i==8)
            {
                System.out.println(i);
                break;
            }
            System.out.println("hello");
     
        }
        String a = sc.next();
        System.out.println(a);
    }
}
