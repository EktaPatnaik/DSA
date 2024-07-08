public class MaximumNumberOfWords {
    public static void main(String args[])
    {
        String sentences[] = {"please wait", "continue to fight", "continue to win"};
        int max=0;
        int wordCount=0;
        for(int i=0;i< sentences.length;i++)
        {
            wordCount=sentences[i].split(" ").length;
            if (max<wordCount)
                max=wordCount;
        }
        System.out.println(max);
    }

}
