//Given an array, sort it by its sum value.
package Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
public class SortBySumOfDigits

{
    public static void main(String args[])
    {
        int[] array={123,45,7,456,89,12,00};
        // We need to convert this int array to Integer object, since sort function only accepts Integer array.

        //Java8 way of converting int to Integer is using Array Stream.
        Integer[] arrayObjects= Arrays.stream(array).boxed().toArray(Integer[]::new);


        /*Java 7 way of converting int to Integer is using for loop.
        Integer[] arrayObjects=new Integer[array.length];
        for(int i=0;i<arrayObjects.length;i++)
        {
            arrayObjects[i]=array[i];
        }*/

        //Sort array objects based on Sum Of Digits.
       Arrays.sort(arrayObjects,Comparator.comparingInt(SortBySumOfDigits::sumOfDigits));

        //Convert Sorted Integer[] back to int[]

        //java 8 way
        int[] sortedArray=Arrays.stream(arrayObjects).mapToInt(Integer::intValue).toArray();

        /*java 7 way
        int[] sortedArray=new Integer[array.length];
        for(int i=0;i<arrayObjects.length;i++)
        {
            sortedArray[i]=arrayObjects[i];
        }*/
        System.out.println("Sorted arrays by sum of digits:"+Arrays.toString(sortedArray));

    }

    public static int sumOfDigits(int num)
    {int sum=0;
        while(num!=0)
        {
            sum=sum+(num%10);
            num=num/10;

        }
        return sum;
    }
}