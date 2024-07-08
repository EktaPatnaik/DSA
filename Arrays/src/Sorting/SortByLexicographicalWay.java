//Given an array, sort it by its lexicographical way eg: 1,11,112,2,3,32,321 (Dictionary form)
package Sorting;
import java.util.Arrays;
import java.util.Comparator;

public class SortByLexicographicalWay {
    public static void main(String args[])
    {
        int[] array={321,11,112,3,2,32,1};
        String[] stringArray=new String[array.length];
        for(int i=0;i<array.length;i++)
        {
            stringArray[i]=array[i]+"";
        }

        Arrays.sort(stringArray);
        System.out.println("Sorted arrays by sum of digits:"+Arrays.toString(stringArray));



    }
}
