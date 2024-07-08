public class CountOfRangeOfSum {
    public static void main(String args[])
    {
        int lower=1;
        int upper =6;
        int num[]={10,2,3,4,5,6,7,8};
        int a[]=new int[num.length];
        a[0]=num[0];

        for(int i=1;i<num.length;i++)
        {a[i]=num[i]+a[i-1];
        }

        if (lower==0)
        {
            System.out.print(a[upper]);
        }
        else if(lower>0)
        {
            System.out.print(a[upper]-a[lower-1]);
        }
    }
}
