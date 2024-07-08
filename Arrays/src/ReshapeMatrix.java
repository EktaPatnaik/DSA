public class ReshapeMatrix {
    public static void main(String args[])
    {
        int mat[][] = {{1,2,5,6},{3,4,7,8},{9,10,11,12}};
        int r = 4, c = 3;


        int ans[][]=new int[r][c];
        int ansRow=0;
        int ansCol=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                ans[ansRow][ansCol]=mat[i][j];
                if(ansCol<c-1)
                {
                    ansCol++;
                }
                else if(ansCol==c-1)
                {
                    ansCol=0;
                    ansRow++;
                }
            }
        }

        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[0].length;j++)
            {
                System.out.print(ans[i][j]+",");
            }
            System.out.println();
        }


    }
}
