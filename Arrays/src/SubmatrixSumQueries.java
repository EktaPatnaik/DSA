//Leet code 304

/*public class SubmatrixSumQueries {
    public static void main(String agrs[])
    {
        int tli=0,tlj=0,rbi=5,rbj=1;
        int mat[][] = {{-4,-5} };
        int prefix_sum[][]=new int[mat.length][mat[0].length];
        prefix_sum[0][0]=mat[0][0];
        int sum_row=mat[0][0];
        int sum_col=mat[0][0];

        if(tli>mat.length-1||rbi>mat.length-1||tlj>mat[0].length-1||rbj>mat[0].length-1||tli<0||rbi<0||tlj<0||rbj<0)
        {System.out.print(mat[0][0]);
        //;}


        // first fill the first row and the first column.
        for(int row=1;row<mat.length;row++)
        {
            sum_row=sum_row+mat[row][0];
            prefix_sum[row][0]=sum_row;
        }

        for(int col=1;col<mat[0].length;col++)
        {

            sum_col=sum_col+mat[0][col];

            prefix_sum[0][col]=sum_col;
        }
        //fill rest of the data.
        for(int row=1;row<mat.length;row++)
        {
            for(int column=1;column<mat[0].length;column++)
            {
                prefix_sum[row][column]=mat[row][column]+prefix_sum[row-1][column]+prefix_sum[row][column-1]-prefix_sum[row-1][column-1];
            }

        }
        for(int row=0;row<mat.length;row++) {
            for (int column = 0; column < mat[0].length; column++) {
                System.out.print(prefix_sum[row][column]+",");
            }
            System.out.println("");
        }

        int ans=0;
        int a=0,b=0,c=0;

        if(tli!=0&&tlj!=0)
        {
            a=prefix_sum[rbi][tlj-1];
            b=prefix_sum[tli-1][rbj];
            c=prefix_sum[tli-1][tlj-1];
        }

        else
        {
            if(tlj!=0)
                a=prefix_sum[rbi][tlj-1];

            else if(tli!=0)
                b=prefix_sum[tli-1][rbj];
        }
        ans=prefix_sum[rbi][rbj]-a-b+c;
        System.out.println(ans);
    }
}*/
