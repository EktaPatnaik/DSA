public class MatrixDiagonalSum {
    public static void main(String args[])
    {
        int[][] mat={{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}};
        int sum=0;
        if (mat.length==1)
            System.out.println( mat[0][0]);
        else {
            for (int i = 0; i < mat.length; i++) {
                int j = mat.length-1 - i;
                sum = sum + mat[i][i] + mat[i][j];
            }
        }
        if (mat.length%2!=0)
            sum=sum-mat[mat.length/2][mat.length/2];
        System.out.println(sum);
    }
}
