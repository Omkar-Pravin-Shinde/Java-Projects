public class Pangram {
    public static void main(String[] args) {
        
        boolean flag = false;
        String s1 = "A quick brown fox jumps over the lazy dog";    //take sentence with all alphbates
        s1 = s1.replace(" ", "");       //remove all blank spaces
        s1 = s1.toUpperCase();          //convert to upper case

        char []arr = s1.toCharArray();          //covert to char arr
        int ar[] = new int[26];             //make one array with 26 elemnts

        for(int i =0 ; i < arr.length ; i++)
        {
            ar[arr[i]-65]++;                //65 is asscii of A  , so arr[i]-65 become index of that alpha and the add 1 to new created array
        }

        for(int i =0 ; i < ar.length ; i++)
        {
            if(ar[i] ==0)               //check any 0 remain in new aray
            {
                flag = true;
            }
        }
        if(flag == false)
        {

            System.out.println("Panagram");
        }
        else
        {
            System.out.println("Not Panagram");

        }

         }
}
