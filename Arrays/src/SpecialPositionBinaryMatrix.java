public class SpecialPositionBinaryMatrix {

    public static void main (String args[]) {
        int mat[][]={{1,0,0},{0,0,1},{1,0,0}};

        int row_sum[]=new int[mat.length];
        int sum=0;
        for (int i=0;i<mat.length;i++)
        {
            for (int j=0;j<mat[0].length;j++)
            {
                sum=sum+mat[i][j];
                if(mat[i][j]==1)
                row_sum[i]=j;
            }
            if(sum!=1)
                row_sum[i]=-1;
            sum=0;
            System.out.print(row_sum[i]+",");
        }
//row_sum has the index of column which has binary digit 1, if its the only 1 present in the row otherwise negative int.
int count=0;
        for (int i=0;i<row_sum.length;i++) {
            if (row_sum[i] >= 0) {
                for (int j = 0; j < mat.length; j++) {
                    sum = sum + mat[j][row_sum[i]];

                }
                if (sum == 1)
                    count++;
                sum = 0;
            }

        }
        System.out.println(count);
    }
}