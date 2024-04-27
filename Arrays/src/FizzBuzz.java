import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class FizzBuzz {
    public static void main(String args[])
    {
        int n=15;
        List<String> result = new ArrayList<>();

        for(int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0)
                result.add("Fizz");
            else if (i % 5 == 0)
                result.add("Buzz");
            else
                result.add(i + "");
        }
            System.out.print(result);





    }
}
