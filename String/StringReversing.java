import java.util.Scanner;

public class StringReversing {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String : ");
     // String str = scan.nextLine();
        String str1 = "";


        //                              CASE 1
        // Enter String : 
        // omkar
        // Bfore :omkar
        // After : rakmo
        // for (int i = str.length()-1; i >= 0; i--) 
        // {
        //     str1 = str1+str.charAt(i);
            
        // }

        // System.out.println("Bfore :" +str);
        // System.out.println("After : "+str1);




            //                          CASE 2
        // Enter String : 
        // omkar shinde
        // shinde omkar
        // String sarr[] = str.split(" ");
        // for(int i =sarr.length-1 ; i>=0;i--)
        // {
        //     str1 = str1+sarr[i]+" ";
        // }
        // System.out.println(str1);



            //                              CASE 3
        // Enter String : 
        // omkar shinde
        // Afte : rakmo ednihs 
        // String str="Think Twice ";
        // String arr[] = str.split(" ");

        // for (String ele : arr) {
        //     for(int i = ele.length()-1;i>=0;i--)
        //     {
        //         str1 = str1+ele.charAt(i);
        //     }
        //     str1=str1+" ";
        // }
        // System.out.println("Afte : "+str1);
        String s = "Hello World";

        int i = s.indexOf('o');

        int j = s.lastIndexOf('l');

        System.out.print(i + " " + j);

}
}