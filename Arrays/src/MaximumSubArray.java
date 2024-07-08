import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String args[])
    {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int size = nums.length;
        int max_so_far = Arrays.stream(nums).max().getAsInt(), max_ending_here
                = 0;

        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
            System.out.print(","+ max_so_far);
        }
        System.out.println( max_so_far);
    }
}
