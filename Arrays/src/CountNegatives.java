public class CountNegatives {
    public static void main(String agrs[])
    {
        int grid[][] = {{3,2},{1,0}};

        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
