import java.util.Arrays;

public class RemoveDuplicates
{
    static void remove(char srr[], int len)
    {
        int index=0;
        for(int i =0 ; i<len;i++)
        {
            int j;
            for( j=0;j<i;j++)
            {
                if(srr[i]==srr[j])
                {
                    break;
                }
            }
            if (j == i)    
            {   
                srr[index++] = srr[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(srr, index)));  
    }
    


    public static void main(String[] args) {
        
        String s1 = "Anna";


        char sarr[] = s1.toCharArray();
        int len = sarr.length;
        remove(sarr,len);

    }
}