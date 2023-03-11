import java.util.Arrays;

public class Mutable {
    public static void main(String[] args) {
          

      
        String str = "Hello World";
        char[] charArray = str.toCharArray();
        
        Arrays.sort(charArray);
        
        String sortedStr = new String(charArray);
        System.out.println(sortedStr);
    

    }
}
