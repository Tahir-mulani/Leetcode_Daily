public class MergeStringAlternatelyleetcode1768APP
{
	public static void main(String x[])
	{
		String word1 = 	"abc",word2 = "pqr";
		System.out.println( "before merged String -> "+word1+","+word2);
		String result = mergeAlternately(word1,word2);
		
		System.out.println("alternate merged String -> " +result);
	}
    public static String mergeAlternately(String word1, String word2)
	{
         StringBuilder result = new StringBuilder();
         int i=0,j=0;

         while(i<word1.length() || j<word2.length()){

            if(i<word1.length()){
                result.append(word1.charAt(i));
                i++;
            }

            if(j<word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
         }

         return result.toString();
    }
}