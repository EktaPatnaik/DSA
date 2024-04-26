import java.util.Arrays;
public class MathAlgorithmProblem {
    public static void main(String[] args) {

        // Expression = |A1[i]-A1[j]|+|A2[i]-A2[j]|+|[i-j]|  find highest value possible.

        int A1[]={1,-2};
        int A2[]={8,8};

        int exp1[]=new int[A1.length],exp2[]=new int[A1.length],exp3[]=new int[A1.length],exp4[]=new int[A1.length];

        for(int i=0;i<A1.length;i++)
        {
            exp1[i]=A1[i]+A2[i]+i;
            exp2[i]=A1[i]+A2[i]-i;
            exp3[i]=A1[i]-A2[i]+i;
            exp4[i]=A1[i]-A2[i]-i;
        }
        //find max val expression.
        int finalValExp[]=new int[4];
        finalValExp[0]= Arrays.stream(exp1).max().getAsInt()-Arrays.stream(exp1).min().getAsInt();
        finalValExp[1]= Arrays.stream(exp2).max().getAsInt()-Arrays.stream(exp2).min().getAsInt();
        finalValExp[2]= Arrays.stream(exp3).max().getAsInt()-Arrays.stream(exp3).min().getAsInt();
        finalValExp[3]= Arrays.stream(exp4).max().getAsInt()-Arrays.stream(exp4).min().getAsInt();

        System.out.print(Arrays.stream(finalValExp).max().getAsInt());





    }
}
