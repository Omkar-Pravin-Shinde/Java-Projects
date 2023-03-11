public class TwoArrayBasics {
    public static void main(String[] args) {
        
        // int a[][] = new int[3][2];

        // a[0][0] = 5;
        // a[0][1] = 2;
        // a[1][0] = 3;
        // a[1][1] = 6;
        // a[2][0] = 1;
        // a[2][1] = 9;

        int a[][] = {

                    {2,4},
                    {3,8},
                    {1,7}
        };
        for(int i =0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


    }
}
