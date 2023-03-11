public class PrintDuplicates {
    public static void main(String[] args) {
        
        String s1 = "beautiful beach";

        char sarr[] = s1.toCharArray();

        System.out.print("Dupicates are: ");
        for (int i = 0; i < sarr.length; i++) {
            for (int j = i+1; j < sarr.length; j++) {
                if(sarr[i] == sarr[j])
                {
                    System.out.print(sarr[j] +" ");
                }
            }
        }

    //    output:
    //       Dupicates are: b e a u 
    }
}
