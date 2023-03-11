import java.util.*;
class ArrayBasics
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[] = new int[5];
        a[0]=5;
        a[1]= 4;
        a[2]=9;
        a[4]=88;
        a[3]=2;
        for(int i=0;i<5;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }

    }
}