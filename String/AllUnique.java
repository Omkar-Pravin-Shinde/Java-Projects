public class AllUnique {
    public static void main(String[] args) {
        
        String s1 = "oomkar";
        boolean res = true;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i+1; j < s1.length(); j++) {
                if(s1.charAt(i) == s1.charAt(j))
                {
                    res = false;
                }
            }
        }

        if(res==true)
        {
            System.out.println("All unique char");
        }
        else
        {
            System.out.println("Not Unique char");
        }


    }
}
