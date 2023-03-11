import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = scan.nextLine();
        String str1 = "";

        for(int i = str.length()-1 ; i>= 0 ;i--)
        {
            str1 = str1 + str.charAt(i);
        }
        boolean result = str.equals(str1);
        System.out.println(result);
        
        // ouput:
        // Enter String : 
        //         2552
        //         true

    }
}
