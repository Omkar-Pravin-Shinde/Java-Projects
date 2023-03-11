import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        
        String s1 = "keep";             
        String s2 = "peek";

        s1 = s1.replace(" ", "");           //Remove Blank Spaces
        s2 = s2.replace(" ", "");


        s1 = s1.toLowerCase();          // COnvert all letter to lower case
        s2 = s2.toLowerCase();

        char []ar1 = s1.toCharArray();  //covert string to char array
        char []ar2 = s2.toCharArray();

        Arrays.sort(ar1);           //Sort both arrays
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2) )            //check if both are equal
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not an Anagram");
        }
    }
}
