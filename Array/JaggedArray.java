public class JaggedArray {
    public static void main(String[] args) {
        
        // int a[][] = new int [3][];
        // a[0] = new int[5];
        // a[1] = new int[3];
        // a[2] = new int[1];

        // a[0][0] = 7;
        // a[0][1] = 3;
        // a[0][2] = 4;
        // a[0][3] = 1;
        // a[0][4] = 8;
        // a[1][0] = 3;
        // a[1][1] = 9;
        // a[1][2] = 0;
        // a[2][0] = 2;

        int a[][]={
            {2,1,5,3},
            {3,8,9},
            {22,3,6,7,9,0}
        };

        for(int i =0 ; i < 3 ; i ++)
        {
            for(int j = 0 ; j <a[i].length;j++)
            {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
