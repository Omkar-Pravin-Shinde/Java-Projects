public class InBuiltMethods {
    public static void main(String[] args) {
        

        String str = "Umbrella";
        boolean pre = false;
       for(int i =0 ; i < str.length();i++)
       {
        if(str.charAt(i)=='e')
        {
            pre= true;
            System.out.println(str.charAt(i));
            break;
        }
       }
       System.out.println(pre);
    }
}
