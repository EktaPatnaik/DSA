public class AlternativePositiveAndNegative {
    public static void main(String args[])
    {
        int input[]={1,2,3,-4,-5,-6};
        int ans[]=new int[input.length];

        int even=0;
        int odd=1;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>0)
            {
                ans[even]=input[i];
                even=even+2;
            }
            else if(input[i]<0)
            {
                ans[odd]=input[i];
                odd=odd+2;
            }
        }
        for(int i=0;i<input.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
