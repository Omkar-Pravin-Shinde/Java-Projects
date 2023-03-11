public class EnhanceForLoopArray {
    public static void main(String[] args) {

        // int nums[] = {2,3,5,53,321,23,422};

        // for (int i : nums) {
        //     System.out.println(i);
        // }

    
        int nums[][]={
            {2,1,5},
            {3,8,9},
            {22,3,0}
        };


        for(int i[]: nums)
        {
            for(int b: i)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
