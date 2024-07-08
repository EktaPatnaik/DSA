public class Transpose {
    public static void main(String args[])
    {
        int input[][]= {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int ans[][]=new int[input[0].length][input.length];

        for (int i=0;i<input.length;i++)
        {
            for(int j=0;j<input[0].length;j++)
            {
                ans[j][i]=input[i][j];
                System.out.print(ans[i][j]+",");
            }

            System.out.println("");
        }

    }
}
