public class SpiralMatrix {
    public static void main(String args[])
    {
    int n=5;
    int[][] ans = new int[n][n];
    int cnt=1;
    int i=0,j=0;
        while(n>1){
        for(int k=1;k<n;k++){
            ans[i][j] = cnt;
            j++;
            cnt++;
        }
        for(int k=1;k<n;k++){
            ans[i][j] = cnt;
            i++;
            cnt++;
        }
        for(int k=1;k<n;k++){
            ans[i][j] = cnt;
            j--;
            cnt++;
        }
        for(int k=1;k<n;k++){
            ans[i][j] = cnt;
            i--;
            cnt++;
        }
        n=n-2;
        i++;
        j++;
    }
        if(n==1){
        ans[i][j]=cnt;
    }
        for(int l=0;l<ans.length;l++){
            for(int m=0;m<ans.length;m++){
                System.out.println(ans[l][m]);}}
}
}
