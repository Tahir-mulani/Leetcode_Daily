/*
leetcode 345 Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both 
lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
*/
import java.util.*;
public class Reverese_Vowels_Of_String
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		System.out.println(reverseVowels(s));
	}
	public static String reverseVowels(String s)
	{
		StringBuilder result = new StringBuilder(s);
		StringBuilder vowel = new StringBuilder();
		
		//Collect all the vowels
		for(int i=0;i<result.length();i++)
		{
			char ch = result.charAt(i);
			if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' ||
			   ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || 
			   ch == 'O'|| ch == 'U')
			{
				vowel.append(ch);
			}
		}
		//Reverse vowels
		vowel.reverse(); 
		
		//put reversed vowels back
		int j=0;
		for(int i = 0; i < result.length(); i++)
        {
            char ch = result.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U')
            {
                result.setCharAt(i, vowel.charAt(j));
                j++;
            }
        }
		return result.toString();
			
    }
}
/*
class Solution{
 public boolean vowelrev(char c){
     return c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public String reverseVowels(String s) {
       char[] ans = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
           while(i<j && !vowelrev(ans[i])){
            i++;
           }
            while(i<j && !vowelrev(ans[j])){
            j--;
           }
           char temp=ans[i];
           ans[i]=ans[j];
           ans[j]=temp;
           i++;
           j--;
        }
 return new String(ans);
    }
}
*/