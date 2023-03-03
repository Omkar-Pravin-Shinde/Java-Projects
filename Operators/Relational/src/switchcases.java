import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your choice : ");
        String num = sc.nextLine();
         switch(num)
         {
            case "+": System.out.println(10+12);
            break;
            case "-": System.out.println(10-12);
            break;
            case "*": System.out.println(10*12);
            break;
            default : System.out.println("ENter valid choice");
         }
    }
}
